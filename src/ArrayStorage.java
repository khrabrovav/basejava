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
        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        return 0;
    }
}
