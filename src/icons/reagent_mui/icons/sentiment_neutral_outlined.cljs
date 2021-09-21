(ns reagent-mui.icons.sentiment-neutral-outlined
  "Imports @mui/icons-material/SentimentNeutralOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sentiment-neutral-outlined (create-svg-icon [(e "path" #js {"d" "M9 14h6v1.5H9z"}) (e "circle" #js {"cx" "15.5", "cy" "9.5", "r" "1.5"}) (e "circle" #js {"cx" "8.5", "cy" "9.5", "r" "1.5"}) (e "path" #js {"d" "M11.99 2C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"})]
                                                 "SentimentNeutralOutlined"))
