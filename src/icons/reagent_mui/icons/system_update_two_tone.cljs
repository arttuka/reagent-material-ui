(ns reagent-mui.icons.system-update-two-tone
  "Imports @mui/icons-material/SystemUpdateTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-update-two-tone (create-svg-icon [(e "path" #js {"d" "M7 19h10V5H7v14zm4-6V8h2v5h3l-4 4-4-4h3z", "opacity" ".3"}) (e "path" #js {"d" "M16 13h-3V8h-2v5H8l4 4zm1-11.99L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 19H7V5h10v14z"})]
                                             "SystemUpdateTwoTone"))
