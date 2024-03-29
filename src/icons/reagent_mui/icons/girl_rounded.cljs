(ns reagent-mui.icons.girl-rounded
  "Imports @mui/icons-material/GirlRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def girl-rounded (create-svg-icon (e "path" #js {"d" "M12 7.5c.97 0 1.75-.78 1.75-1.75S12.97 4 12 4s-1.75.78-1.75 1.75S11.03 7.5 12 7.5zm2 8.5v3c0 .55-.45 1-1 1h-2c-.55 0-1-.45-1-1v-3h-.56c-.7 0-1.18-.7-.94-1.35l1.88-5.03c.25-.67.9-1.12 1.62-1.12s1.37.45 1.62 1.12l1.88 5.03c.24.65-.24 1.35-.94 1.35H14z"})
                                   "GirlRounded"))
