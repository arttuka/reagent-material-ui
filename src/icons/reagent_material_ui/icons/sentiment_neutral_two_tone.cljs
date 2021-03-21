(ns reagent-material-ui.icons.sentiment-neutral-two-tone
  "Imports @material-ui/icons/SentimentNeutralTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sentiment-neutral-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4c-4.42 0-8 3.58-8 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8zM7 9.5C7 8.67 7.67 8 8.5 8s1.5.67 1.5 1.5S9.33 11 8.5 11 7 10.33 7 9.5zm8 6H9V14h6v1.5zm.5-4.5c-.83 0-1.5-.67-1.5-1.5S14.67 8 15.5 8s1.5.67 1.5 1.5-.67 1.5-1.5 1.5z", "opacity" ".3"}) (e "path" #js {"d" "M9 14h6v1.5H9z"}) (e "circle" #js {"cy" "9.5", "r" "1.5", "cx" "15.5"}) (e "circle" #js {"cy" "9.5", "r" "1.5", "cx" "8.5"}) (e "path" #js {"d" "M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}))
                                                 "SentimentNeutralTwoTone"))
