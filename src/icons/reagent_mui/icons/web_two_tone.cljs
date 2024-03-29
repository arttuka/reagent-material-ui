(ns reagent-mui.icons.web-two-tone
  "Imports @mui/icons-material/WebTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def web-two-tone (create-svg-icon [(e "path" #js {"d" "M4 9h10.5v3.5H4zm0 5.5h10.5V18H4zM16.5 9H20v9h-3.5z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-5.5 14H4v-3.5h10.5V18zm0-5.5H4V9h10.5v3.5zM20 18h-3.5V9H20v9z"})]
                                   "WebTwoTone"))
