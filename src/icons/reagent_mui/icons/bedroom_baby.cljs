(ns reagent-mui.icons.bedroom-baby
  "Imports @mui/icons-material/BedroomBaby as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bedroom-baby (create-svg-icon [(e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-8 16c-2.64 0-5.13-1.03-7-2.9l1.06-1.06c.34.34.71.65 1.1.92L8 13.5V9.51l-1.55.99-.95-1L7 7.76 6 7h3.65l1.73 3H17v1h-1v2.5l.84 1.46c.39-.28.76-.58 1.1-.92L19 15.1c-1.87 1.87-4.36 2.9-7 2.9z"}) (e "path" #js {"d" "M14.69 14.24c-1.74.65-3.66.65-5.4 0l-.81 1.41-.03.06c1.1.52 2.28.79 3.53.79s2.45-.28 3.55-.79l-.03-.06-.81-1.41z"})]
                                   "BedroomBaby"))
