(ns reagent-mui.icons.local-pizza-rounded
  "Imports @mui/icons-material/LocalPizzaRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-pizza-rounded (create-svg-icon (e "path" #js {"d" "M12 2C9.01 2 6.28 3.08 4.17 4.88c-.71.61-.86 1.65-.4 2.46l7.36 13.11c.38.68 1.36.68 1.74 0l7.36-13.11c.46-.81.31-1.86-.4-2.46C17.73 3.09 14.99 2 12 2zM7 7c0-1.1.9-2 2-2s2 .9 2 2-.9 2-2 2-2-.9-2-2zm5 8c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})
                                          "LocalPizzaRounded"))
