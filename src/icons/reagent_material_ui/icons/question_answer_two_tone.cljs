(ns reagent-material-ui.icons.question-answer-two-tone
  "Imports @material-ui/icons/QuestionAnswerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def question-answer-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 11V4H4v8.17l.59-.58.58-.59H6z", "opacity" ".3"}) (e "path" #js {"d" "M21 6h-2v9H6v2c0 .55.45 1 1 1h11l4 4V7c0-.55-.45-1-1-1zm-5 7c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v14l4-4h10zM4.59 11.59l-.59.58V4h11v7H5.17l-.58.59z"}))
                                               "QuestionAnswerTwoTone"))
