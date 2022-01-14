package per.nonlone.vertebra.product.common;


/**
 * 最后执行器
 */
public interface PersistExecutor {

    /**
     * 添加任务
     * @param runnable
     */
    void add(Runnable runnable);

    /**
     * 添加任务，但是需要包裹异常
     * @param runnable
     * @param exception
     */
    default void add(Runnable runnable,RuntimeException exception) {
        this.add(()->{
            try{
                runnable.run();
            }catch (Exception e){
                throw exception;
            }
        });
    }

    /**
     * 执行
     */
    void execute();


}
