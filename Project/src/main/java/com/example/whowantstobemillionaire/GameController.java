package com.example.whowantstobemillionaire;

import com.example.whowantstobemillionaire.help.FiftyFiftyHelp;
import com.example.whowantstobemillionaire.help.HelpAnswer;
import com.example.whowantstobemillionaire.levels.Answer;
import com.example.whowantstobemillionaire.levels.Levels;
import com.example.whowantstobemillionaire.levels.Question;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class GameController {
    @FXML
    private Label currentScoreLabel;
    @FXML
    private Label currentLevelLabel;
    @FXML
    private Button fiftyFiftyBtn;
    @FXML
    private Button audienceHelpBtn;
    @FXML
    private Button phoneHelpBtn;
    @FXML
    private Label questionLabel;
    @FXML
    private Button optionABtn;
    @FXML
    private Button optionBBtn;
    @FXML
    private Button optionCBtn;
    @FXML
    private Button optionDBtn;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private int score = 0;
    private int level = 1;

    private  Levels questionsAndAnswers = new Levels();
    private Question currentQuestion = questionsAndAnswers.getQuestionByLevel(level);
    private ArrayList<Answer> answers = currentQuestion.getAnswers();

    private Answer answerA = answers.get(0);
    private Answer answerB = answers.get(1);
    private Answer answerC = answers.get(2);
    private Answer answerD = answers.get(3);


    public void launchGame() {
        level = 1;
        score = 0;

        currentQuestion = questionsAndAnswers.getQuestionByLevel(level);
        answers = currentQuestion.getAnswers();

        answerA = answers.get(0);
        answerB = answers.get(1);
        answerC = answers.get(2);
        answerD = answers.get(3);

        displayCurrentLevel(level);
        displayCurrentScore(score);
        displayQuestion(currentQuestion);
        displayAnswers(answerA, answerB, answerC, answerD);
    }

    public void playNextLevel() {
        if (optionABtn.isDisable()) {
            optionABtn.setDisable(false);
        }
        if (optionBBtn.isDisable()) {
            optionBBtn.setDisable(false);
        }
        if (optionCBtn.isDisable()) {
            optionCBtn.setDisable(false);
        }
        if (optionDBtn.isDisable()) {
            optionDBtn.setDisable(false);
        }

        level++;
        score += 100;

        currentQuestion = questionsAndAnswers.getQuestionByLevel(level);
        answers = currentQuestion.getAnswers();

        answerA = answers.get(0);
        answerB = answers.get(1);
        answerC = answers.get(2);
        answerD = answers.get(3);

        displayCurrentLevel(level);
        displayCurrentScore(score);
        displayQuestion(currentQuestion);
        displayAnswers(answerA, answerB, answerC, answerD);
    }

    /*display player's current score*/
    public void displayCurrentScore(int score) {
        currentScoreLabel.setText("Scor: " + score);
    }

    /*display current level*/
    public void displayCurrentLevel(int level) {
        currentLevelLabel.setText("Nivel: " + level);
    }

    /*display question*/
    public void displayQuestion(Question currentQuestion) {
        questionLabel.setText(currentQuestion.getQuestion());
    }

    /*display answers (+ options)*/
    public void displayAnswers(Answer answerA, Answer answerB, Answer answerC, Answer answerD) {
        optionABtn.setText(answerA.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerA.getAnswer());
        optionBBtn.setText(answerB.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerB.getAnswer());
        optionCBtn.setText(answerC.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerC.getAnswer());
        optionDBtn.setText(answerD.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerD.getAnswer());
    }

    /*fiftyFiftyHelp option btn*/
    public void fiftyFiftyHelp(ActionEvent event) {
        FiftyFiftyHelp fiftyFiftyHelp = new FiftyFiftyHelp();
        ArrayList<Answer> wrongHelpAnswers = fiftyFiftyHelp.getWrongHelpAnswers(currentQuestion);

        Answer firstWrongAnswer = wrongHelpAnswers.get(0);
        Answer secondWrongAnswer = wrongHelpAnswers.get(1);

        switch (firstWrongAnswer.getAnswerOption()) {
            case A -> optionABtn.setDisable(true);
            case B -> optionBBtn.setDisable(true);
            case C -> optionCBtn.setDisable(true);
            case D -> optionDBtn.setDisable(true);
        }
        switch (secondWrongAnswer.getAnswerOption()) {
            case A -> optionABtn.setDisable(true);
            case B -> optionBBtn.setDisable(true);
            case C -> optionCBtn.setDisable(true);
            case D -> optionDBtn.setDisable(true);
        }
        fiftyFiftyBtn.setDisable(true);
    }

    /*audienceHelp btn*/
    public void AudienceHelpBtn(ActionEvent event) {
        Answer correctAnswer = currentQuestion.getCorrectAnswer(currentQuestion.getAnswers());
        HelpAnswer helpCorrectAnswer = new HelpAnswer(correctAnswer, 70);
        switch (correctAnswer.getAnswerOption()) {
            case A -> {
                optionABtn.setText(answerA.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerA.getAnswer() + " - " + helpCorrectAnswer.getProbability());
                optionBBtn.setText(answerB.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerB.getAnswer() + " - 10.0");
                optionCBtn.setText(answerC.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerC.getAnswer() + " - 10.0");
                optionDBtn.setText(answerD.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerD.getAnswer() + " - 10.0");
            }
            case B -> {
                optionABtn.setText(answerA.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerA.getAnswer() + " - 10.0");
                optionBBtn.setText(answerB.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerB.getAnswer() + " - " + helpCorrectAnswer.getProbability());
                optionCBtn.setText(answerC.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerC.getAnswer() + " - 10.0");
                optionDBtn.setText(answerD.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerD.getAnswer() + " - 10.0");
            }
            case C -> {
                optionABtn.setText(answerA.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerA.getAnswer() + " - 10.0");
                optionBBtn.setText(answerB.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerB.getAnswer() + " - 10.0");
                optionCBtn.setText(answerC.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerC.getAnswer() + " - " + helpCorrectAnswer.getProbability());
                optionDBtn.setText(answerD.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerD.getAnswer() + " - 10.0");
            }
            case D -> {
                optionABtn.setText(answerA.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerA.getAnswer() + " - 10.0");
                optionBBtn.setText(answerB.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerB.getAnswer() + " - 10.0");
                optionCBtn.setText(answerC.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerC.getAnswer() + " - 10.0");
                optionDBtn.setText(answerD.getAnswerOption().toString().toLowerCase(Locale.ROOT) + ": " + answerD.getAnswer() + " - " + helpCorrectAnswer.getProbability());
            }
        }
        audienceHelpBtn.setDisable(true);
    }

    /*phoneHelp btn*/
    public void phoneHelp(ActionEvent event) {
        ArrayList<Answer> wrongAnswers = currentQuestion.getWrongAnswers(currentQuestion.getAnswers());
        Answer firstWrongAnswer = wrongAnswers.get(0);
        Answer secondWrongAnswer = wrongAnswers.get(1);
        Answer thirdWrongAnswer = wrongAnswers.get(2);

        switch (firstWrongAnswer.getAnswerOption()) {
            case A -> optionABtn.setDisable(true);
            case B -> optionBBtn.setDisable(true);
            case C -> optionCBtn.setDisable(true);
            case D -> optionDBtn.setDisable(true);
        }
        switch (secondWrongAnswer.getAnswerOption()) {
            case A -> optionABtn.setDisable(true);
            case B -> optionBBtn.setDisable(true);
            case C -> optionCBtn.setDisable(true);
            case D -> optionDBtn.setDisable(true);
        }
        switch (thirdWrongAnswer.getAnswerOption()) {
            case A -> optionABtn.setDisable(true);
            case B -> optionBBtn.setDisable(true);
            case C -> optionCBtn.setDisable(true);
            case D -> optionDBtn.setDisable(true);
        }
        phoneHelpBtn.setDisable(true);
    }

    /*verifyOptionA*/
    public void verifyAnswerA(ActionEvent event) throws IOException {
        if (level >= 5 && answerA.isCorrect()) {
            getGameWinScene(event);
        } else if (answerA.isCorrect()) {
            playNextLevel();
        } else {
            getGameLostScene(event);
        }
    }
    /*verifyOptionB*/
    public void verifyAnswerB(ActionEvent event) throws IOException {
        if (level >= 5 && answerB.isCorrect()) {
            getGameWinScene(event);
        } else if (answerB.isCorrect()) {
            playNextLevel();
        } else {
            getGameLostScene(event);
        }
    }
    /*verifyOptionC*/
    public void verifyAnswerC(ActionEvent event) throws IOException {
        if (level >= 5 && answerC.isCorrect()) {
            getGameWinScene(event);
        } else if (answerC.isCorrect()) {
            playNextLevel();
        } else {
            getGameLostScene(event);
        }
    }
    /*verifyOptionD*/
    public void verifyAnswerD(ActionEvent event) throws IOException {
        if (level >= 5 && answerD.isCorrect()) {
            getGameWinScene(event);
        } else if (answerD.isCorrect()) {
            playNextLevel();
        } else {
            getGameLostScene(event);
        }
    }


    public void getGameWinScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameWin.fxml"));
        root = loader.load();

        GameWinController gameWinController = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cine vrea sa fie milionar?");
        stage.show();
    }

    public void getGameLostScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameLost.fxml"));
        root = loader.load();

        GameLostController gameLostController = loader.getController();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cine vrea sa fie milionar?");
        stage.show();
    }
}
