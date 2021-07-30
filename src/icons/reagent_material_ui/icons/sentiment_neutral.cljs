(ns reagent-material-ui.icons.sentiment-neutral
  "Imports @material-ui/icons/SentimentNeutral as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sentiment-neutral (create-svg-icon [(e "path" #js {"d" "M9 15.5h6v1H9v-1z"}) (e "circle" #js {"cx" "15.5", "cy" "9.5", "r" "1.5"}) (e "circle" #js {"cx" "8.5", "cy" "9.5", "r" "1.5"}) (e "path" #js {"d" "M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"})]
                                        "SentimentNeutral"))
