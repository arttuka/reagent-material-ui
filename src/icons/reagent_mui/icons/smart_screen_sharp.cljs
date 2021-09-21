(ns reagent-mui.icons.smart-screen-sharp
  "Imports @mui/icons-material/SmartScreenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def smart-screen-sharp (create-svg-icon [(e "path" #js {"d" "M1 5v14h22V5H1zm17 12H6V7h12v10z"}) (e "path" #js {"d" "M12.5 11.25H14v1.5h-1.5zm2.5 0h1.5v1.5H15zm-5 0h1.5v1.5H10zm-2.5 0H9v1.5H7.5z"})]
                                         "SmartScreenSharp"))
