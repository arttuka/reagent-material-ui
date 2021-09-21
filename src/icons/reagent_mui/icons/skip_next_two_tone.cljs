(ns reagent-mui.icons.skip-next-two-tone
  "Imports @mui/icons-material/SkipNextTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def skip-next-two-tone (create-svg-icon [(e "path" #js {"d" "M8 9.86v4.28L11.03 12z", "opacity" ".3"}) (e "path" #js {"d" "M14.5 12 6 6v12l8.5-6zM8 9.86 11.03 12 8 14.14V9.86zM16 6h2v12h-2z"})]
                                         "SkipNextTwoTone"))
