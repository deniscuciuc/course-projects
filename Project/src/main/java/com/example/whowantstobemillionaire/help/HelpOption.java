package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.help.HelpAnswer;
import com.example.whowantstobemillionaire.levels.Question;

import java.util.ArrayList;

public abstract class HelpOption {
    private boolean isUsed;

    public abstract ArrayList<HelpAnswer> getHelpAnswers(Question question);
}
