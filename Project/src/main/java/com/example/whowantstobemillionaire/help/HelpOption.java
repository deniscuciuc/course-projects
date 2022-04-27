package com.example.whowantstobemillionaire.help;

import com.example.whowantstobemillionaire.levels.Question;

public abstract class HelpOption {
    private boolean isUsed;

    public abstract HelpAnswer[] getHelpAnswers(Question question);
}
