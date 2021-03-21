(ns reagent-material-ui.icons.sentiment-very-dissatisfied-rounded
  "Imports @material-ui/icons/SentimentVeryDissatisfiedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sentiment-very-dissatisfied-rounded (create-svg-icon (e "path" #js {"d" "M11.99 2C6.47 2 2 6.47 2 12s4.47 10 9.99 10S22 17.53 22 12 17.52 2 11.99 2zm-4.7 7.35c-.29-.29-.29-.77 0-1.06.29-.29.77-.29 1.06 0l.53.53.53-.53c.29-.29.77-.29 1.06 0 .29.29.29.77 0 1.06l-.53.53.53.53c.29.29.29.77 0 1.06-.29.29-.77.29-1.06 0l-.53-.53-.53.53c-.29.29-.77.29-1.06 0-.29-.29-.29-.77 0-1.06l.53-.53-.53-.53zM16.31 17H7.69c-.38 0-.63-.42-.44-.75.95-1.64 2.72-2.75 4.75-2.75s3.8 1.11 4.75 2.75c.19.33-.06.75-.44.75zm.4-6.59c.29.29.29.77 0 1.06-.29.29-.77.29-1.06 0l-.53-.53-.53.53c-.29.29-.77.29-1.06 0-.29-.29-.29-.77 0-1.06l.53-.53-.53-.53c-.29-.29-.29-.77 0-1.06.29-.29.77-.29 1.06 0l.53.53.53-.53c.29-.29.77-.29 1.06 0 .29.29.29.77 0 1.06l-.53.53.53.53z"})
                                                          "SentimentVeryDissatisfiedRounded"))
