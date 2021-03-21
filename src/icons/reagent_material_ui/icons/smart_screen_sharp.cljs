(ns reagent-material-ui.icons.smart-screen-sharp
  "Imports @material-ui/icons/SmartScreenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def smart-screen-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M1 5v14h22V5H1zm17 12H6V7h12v10z"}) (e "path" #js {"d" "M12.5 11.25H14v1.5h-1.5zm2.5 0h1.5v1.5H15zm-5 0h1.5v1.5H10zm-2.5 0H9v1.5H7.5z"}))
                                         "SmartScreenSharp"))
