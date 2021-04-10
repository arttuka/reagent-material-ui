(ns reagent-material-ui.icons.laptop-mac-two-tone
  "Imports @material-ui/icons/LaptopMacTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def laptop-mac-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 5h16v11H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 18c1.1 0 1.99-.9 1.99-2L22 5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2H0c0 1.1.9 2 2 2h20c1.1 0 2-.9 2-2h-4zM4 5h16v11H4V5zm8 14c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"}))
                                          "LaptopMacTwoTone"))
