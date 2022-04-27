package ${package}.error;

import com.viettel.vtskit.common.exception.AbstractExceptionHandler;
import com.viettel.vtskit.common.rest.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandler extends AbstractExceptionHandler {

    @Override
    protected ResponseEntity<ErrorDTO> handleAccessDeniedException() {
        return super.handleAccessDeniedException();
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleCommonException(Exception ex) {
        ex.printStackTrace();
        return super.handleCommonException(ex);
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleMethodArgumentException(MethodArgumentNotValidException ex) {
        ex.printStackTrace();
        return super.handleMethodArgumentException(ex);
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleConstraintViolationException(ConstraintViolationException ex) {
        ex.printStackTrace();
        return super.handleConstraintViolationException(ex);
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleMissingPartException(Exception ex) {
        ex.printStackTrace();
        return super.handleMissingPartException(ex);
    }
}
