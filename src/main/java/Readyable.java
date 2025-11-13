public interface Readyable {
    boolean ready();

    void getEstimatedTimeMinutes(int time, int ordersize);
    // todo: final estimator formula lives in the implementing class using base unit * category units * delivery factor
    // why: keeps interface small and pushes policy to implementation
}
// ordersize — drinks (0.1), appetizers (0.25), salads (0.25), main course (1), signatures (1.25), chef spec. vip options (2) (subscription requisite), dessert (1)
 // this will be the interface that will provide an estimated time