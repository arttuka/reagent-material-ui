(ns reagent-mui.icons.question-answer-sharp
  "Imports @mui/icons-material/QuestionAnswerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def question-answer-sharp (create-svg-icon (e "path" #js {"d" "M22 6h-3v9H6v3h12l4 4V6zm-5 7V2H2v15l4-4h11z"})
                                            "QuestionAnswerSharp"))
