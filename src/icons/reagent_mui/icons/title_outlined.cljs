(ns reagent-mui.icons.title-outlined
  "Imports @mui/icons-material/TitleOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def title-outlined (create-svg-icon (e "path" #js {"d" "M5 4v3h5.5v12h3V7H19V4H5z"})
                                     "TitleOutlined"))
