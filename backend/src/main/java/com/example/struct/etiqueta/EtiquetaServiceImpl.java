package com.example.struct.etiqueta;
import com.example.EtiquetaGRPCServiceGrpc;
import com.example.EtiquetaRequest;
import com.example.EtiquetaResponse;
import io.grpc.stub.StreamObserver;

public class EtiquetaServiceImpl extends EtiquetaGRPCServiceGrpc.EtiquetaGRPCServiceImplBase {

    @Override
    public void send(
            EtiquetaRequest request, StreamObserver<EtiquetaResponse> responseObserver) {

        Boolean success = true;

        EtiquetaResponse response = EtiquetaResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}