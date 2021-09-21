(ns reagent-mui.icons.repeat-one-two-tone
  "Imports @mui/icons-material/RepeatOneTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def repeat-one-two-tone (create-svg-icon (e "path" #js {"d" "M13 15V9h-1l-2 1v1h1.5v4zm6-2h-2v4H7v-3l-4 4 4 4v-3h12zM17 2v3H5v6h2V7h10v3l4-4z"})
                                          "RepeatOneTwoTone"))
