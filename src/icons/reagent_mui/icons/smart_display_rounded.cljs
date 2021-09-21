(ns reagent-mui.icons.smart-display-rounded
  "Imports @mui/icons-material/SmartDisplayRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def smart-display-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM9.5 14.67V9.33c0-.79.88-1.27 1.54-.84l4.15 2.67c.61.39.61 1.29 0 1.68l-4.15 2.67c-.66.43-1.54-.05-1.54-.84z"})
                                            "SmartDisplayRounded"))
