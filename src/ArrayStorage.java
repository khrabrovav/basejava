/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        /*
        Метод пробегает по всем не null элементам массива и делает их null
        */
        for (int i = 0; i < this.size(); i++) {
            this.storage[i] = null;
        }
    }

    void save(Resume resume) {
        /*
        Метод записывает в последний не null элемент массива объект resume
        */
        this.storage[this.size()] = resume;
    }

    Resume get(String uuid) {
        /*
        Возвращает элемент массива, у которого uuid равен параметру метода.
        Если такого элемента нет - возвращает null
        */
        for (int i = 0; i < this.size(); i++) {
            if (this.storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        /*
        Метод удаляет элемент с соответствующим uuid из массива и сдвигает
        остальные элементы влево. Затем последнему элементу присваивает null
        */
        for (int i = 0; i < this.size(); i++) {
            if (this.storage[i].uuid.equals(uuid)) {
                int new_size = this.size() - 1;
                this.storage[i] = null;
                for (int y = i; y < new_size; y++) {
                    this.storage[y] = this.storage[y + 1];
                }
                this.storage[new_size] = null;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] resumes = new Resume[this.size()];
        for (int i = 0; i < this.size(); i++) {
            resumes[i] = this.storage[i];
        }
        return resumes;
    }

    int size() {
        /*
        Возвращает размер массива или его последний индекс не равный null
        */
        for (int i = 0; i <= 10000; i++) {
            if (this.storage[i] == null) {
                return i;
            }
        }
        return 0;
    }
}
