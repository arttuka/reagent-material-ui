(ns reagent-material-ui.icons.burst-mode-two-tone
  "Imports @material-ui/icons/BurstModeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def burst-mode-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 17h10V7H11v10zm3-3.53l1.43 1.72 2-2.58L20 15.99h-8l2-2.52z", "opacity" ".3"}) (e "path" #js {"d" "M1 5h2v14H1zm4 0h2v14H5zm17 0H10c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1h12c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1zm-1 12H11V7h10v10zm-3.57-4.38l-2 2.57L14 13.47l-2 2.52h8z"}))
                                          "BurstModeTwoTone"))
