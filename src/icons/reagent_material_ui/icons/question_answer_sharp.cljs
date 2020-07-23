(ns reagent-material-ui.icons.question-answer-sharp
  "Imports @material-ui/icons/QuestionAnswerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def question-answer-sharp (create-svg-icon (e "path" #js {"d" "M22 6h-3v9H6v3h12l4 4V6zm-5 7V2H2v15l4-4h11z"})
                                            "QuestionAnswerSharp"))
