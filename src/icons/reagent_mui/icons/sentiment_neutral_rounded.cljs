(ns reagent-mui.icons.sentiment-neutral-rounded
  "Imports @mui/icons-material/SentimentNeutralRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sentiment-neutral-rounded (create-svg-icon [(e "path" #js {"d" "M9.75 15.5h4.5c.41 0 .75-.34.75-.75s-.34-.75-.75-.75h-4.5c-.41 0-.75.34-.75.75s.34.75.75.75z"}) (e "circle" #js {"cx" "15.5", "cy" "9.5", "r" "1.5"}) (e "circle" #js {"cx" "8.5", "cy" "9.5", "r" "1.5"}) (e "path" #js {"d" "M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"})]
                                                "SentimentNeutralRounded"))
