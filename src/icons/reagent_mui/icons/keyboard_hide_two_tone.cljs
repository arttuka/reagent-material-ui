(ns reagent-mui.icons.keyboard-hide-two-tone
  "Imports @mui/icons-material/KeyboardHideTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-hide-two-tone (create-svg-icon [(e "path" #js {"d" "M4 15h16V5H4v10zm13-9h2v2h-2V6zm0 3h2v2h-2V9zm-3-3h2v2h-2V6zm0 3h2v2h-2V9zm-3-3h2v2h-2V6zm0 3h2v2h-2V9zM8 6h2v2H8V6zm0 3h2v2H8V9zm0 3h8v2H8v-2zM5 6h2v2H5V6zm0 3h2v2H5V9z", "opacity" ".3"}) (e "path" #js {"d" "M20 3H4c-1.1 0-1.99.9-1.99 2L2 15c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 12H4V5h16v10zm-9-9h2v2h-2zm0 3h2v2h-2zM8 6h2v2H8zm0 3h2v2H8zM5 9h2v2H5zm0-3h2v2H5zm3 6h8v2H8zm6-3h2v2h-2zm0-3h2v2h-2zm3 3h2v2h-2zm0-3h2v2h-2zm-5 17 4-4H8l4 4z"})]
                                             "KeyboardHideTwoTone"))
