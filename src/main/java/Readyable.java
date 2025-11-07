public interface Readyable {
    boolean ready();
    int getEstimatedTime = 0;
    void getEstimatedTime(int time, int ordersize);
}
// ordersize — drinks (0.1), appetizers (0.25), salads (0.25), main course (1), signatures (1.25), chef spec. vip options (2) (subscription requisite), dessert (1)
 // this will be the interface that will provide an estimated time