package oop.patterns.observer;

public class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name) {
        this.name = name;
    }

    public void follow(Subject subject) {
        this.subject = subject;
        subject.addFollower(this);
    }
    public void unFollow(Subject subject) {
        this.subject = null;
        subject.removeFollower(this);
    }

    public void notifyOfSubjectUpdate() {
        System.out.println("Sunt " + name+ " si am primit o notificare de la "
                + subject.getName()+ ": " + subject.getStatus());
    }


}
