package sai.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import sai.learn.aop.annotaion.NotificationType;
import sai.learn.aop.annotaion.SymboNotifier;
import sai.learn.aop.annotaion.SymboProduct;
import sai.learn.aop.annotaion.SymboStage;
import sai.learn.aop.exceptions.ProposalFailureException;
import sai.learn.aop.exceptions.QuoteFailureException;
import sai.learn.feign.CrossFitTest;
import sai.learn.feign.ExerciseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class TestService {

    @Autowired
    private CrossFitTest crossFitTest;

    @Autowired
    private ExerciseTest exerciseTest;

    public List<String> normalFeinCalls() {
        List<String> listValues = new ArrayList<>();
        try {
            listValues.addAll(crossFitTest.getListValues());
            listValues.addAll(exerciseTest.getListValues());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listValues;
    }


    public void rxFeignCall() {

    }


    public static void main(String[] args) {
//        Observable.

        Observable<String> observable1 = Observable.just("").concatMap(s -> {
            return Observable.just("").delay(500, TimeUnit.MILLISECONDS);
        });
        System.out.println();

//        Observable<String> observable = Observable.just("sai11223", "SAI225", "saiqwertywer");
//        Subscription subscribe = observable.subscribe(
//                data -> {
//                    System.out.println(data + "----" + data.charAt(7));
//                },
//                throwable -> System.out.println(throwable.getMessage()),
//                () -> System.out.println("DONE")
//        );
//
//        observable.groupBy(s -> {return "";}).subscribe(data->{
////           data.
//        });


    }

    @SymboNotifier(type = {NotificationType.EMAIL},stage = SymboStage.PROPOSAL,product = SymboProduct.CAR)
    public String getData(int den) throws Exception {

        switch (den) {
            case 1:
                throw new QuoteFailureException("Quote Failed","");

            case 2:
                throw new ProposalFailureException();

            case 3:
                throw new Exception();
            case 4:
                int i = den / 0;
            default:
                return "Hello";
        }
    }
}
