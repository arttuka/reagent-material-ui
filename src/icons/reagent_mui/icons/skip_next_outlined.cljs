(ns reagent-mui.icons.skip-next-outlined
  "Imports @mui/icons-material/SkipNextOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def skip-next-outlined (create-svg-icon (e "path" #js {"d" "m6 18 8.5-6L6 6v12zm2-8.14L11.03 12 8 14.14V9.86zM16 6h2v12h-2z"})
                                         "SkipNextOutlined"))
