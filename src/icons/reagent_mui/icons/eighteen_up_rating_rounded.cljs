(ns reagent-mui.icons.eighteen-up-rating-rounded
  "Imports @mui/icons-material/EighteenUpRatingRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def eighteen-up-rating-rounded (create-svg-icon [(e "path" #js {"d" "M13 12.5h1.5V14H13zm0-2.5h1.5v1.5H13z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM9.25 15c-.41 0-.75-.34-.75-.75V10.5h-.75c-.41 0-.75-.34-.75-.75S7.34 9 7.75 9H9c.55 0 1 .45 1 1v4.25c0 .41-.34.75-.75.75zM16 14c0 .55-.45 1-1 1h-2.5c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1H15c.55 0 1 .45 1 1v4z"})]
                                                 "EighteenUpRatingRounded"))
