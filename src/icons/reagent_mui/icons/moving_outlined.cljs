(ns reagent-mui.icons.moving-outlined
  "Imports @mui/icons-material/MovingOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def moving-outlined (create-svg-icon (e "path" #js {"d" "M20 9.42V12h2V6h-6v2h2.58l-4.46 4.46c-.39.39-1.02.39-1.41 0l-1.17-1.17c-1.17-1.17-3.07-1.17-4.24 0L2 16.59 3.41 18l5.29-5.29c.39-.39 1.02-.39 1.41 0l1.17 1.17c1.17 1.17 3.07 1.17 4.24 0L20 9.42z"})
                                      "MovingOutlined"))
