(ns reagent-material-ui.icons.mic-none-two-tone
  "Imports @material-ui/icons/MicNoneTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def mic-none-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 12c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v6c0 .55.45 1 1 1z", "opacity" ".3"}) (e "path" #js {"d" "M12 14c1.66 0 3-1.34 3-3V5c0-1.66-1.34-3-3-3S9 3.34 9 5v6c0 1.66 1.34 3 3 3zm-1-9c0-.55.45-1 1-1s1 .45 1 1v6c0 .55-.45 1-1 1s-1-.45-1-1V5zm6 6c0 2.76-2.24 5-5 5s-5-2.24-5-5H5c0 3.53 2.61 6.43 6 6.92V21h2v-3.08c3.39-.49 6-3.39 6-6.92h-2z"}))
                                        "MicNoneTwoTone"))
