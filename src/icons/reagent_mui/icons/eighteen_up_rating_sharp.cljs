(ns reagent-mui.icons.eighteen-up-rating-sharp
  "Imports @mui/icons-material/EighteenUpRatingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def eighteen-up-rating-sharp (create-svg-icon [(e "path" #js {"d" "M13 12.5h1.5V14H13zm0-2.5h1.5v1.5H13z"}) (e "path" #js {"d" "M21 3H3v18h18V3zM10 15H8.5v-4.5H7V9h3v6zm6-1c0 .55-.45 1-1 1h-2.5c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1H15c.55 0 1 .45 1 1v4z"})]
                                               "EighteenUpRatingSharp"))
