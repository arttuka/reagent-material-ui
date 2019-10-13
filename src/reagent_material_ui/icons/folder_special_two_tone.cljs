(ns reagent-material-ui.icons.folder-special-two-tone
  "Imports @material-ui/icons/FolderSpecialTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def folder-special-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M11.17 8l-2-2H4v12h16V8h-8.83zM15 9l1.19 2.79 3.03.26-2.3 1.99.69 2.96L15 15.47 12.39 17l.69-2.96-2.3-1.99 3.03-.26L15 9z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l2 2H20v10zm-6.92-3.96L12.39 17 15 15.47 17.61 17l-.69-2.96 2.3-1.99-3.03-.26L15 9l-1.19 2.79-3.03.26z"}))
                                              "FolderSpecialTwoTone"))
