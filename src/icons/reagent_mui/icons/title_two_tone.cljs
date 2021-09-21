(ns reagent-mui.icons.title-two-tone
  "Imports @mui/icons-material/TitleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def title-two-tone (create-svg-icon (e "path" #js {"d" "M5 7h5.5v12h3V7H19V4H5z"})
                                     "TitleTwoTone"))
