(ns reagent-mui.icons.south-west-rounded
  "Imports @mui/icons-material/SouthWestRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def south-west-rounded (create-svg-icon (e "path" #js {"d" "M15 18c0-.56-.45-1-1-1H8.41L19.3 6.11c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L7 15.59V10c0-.55-.45-1-1-1s-1 .45-1 1v8c0 .55.45 1 1 1h8c.55 0 1-.45 1-1z"})
                                         "SouthWestRounded"))
