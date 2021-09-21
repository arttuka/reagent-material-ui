(ns reagent-mui.icons.pause-outlined
  "Imports @mui/icons-material/PauseOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pause-outlined (create-svg-icon (e "path" #js {"d" "M6 19h4V5H6v14zm8-14v14h4V5h-4z"})
                                     "PauseOutlined"))
