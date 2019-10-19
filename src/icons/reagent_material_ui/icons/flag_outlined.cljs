(ns reagent-material-ui.icons.flag-outlined
  "Imports @material-ui/icons/FlagOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def flag-outlined (create-svg-icon (e "path" #js {"d" "M12.36 6l.4 2H18v6h-3.36l-.4-2H7V6h5.36M14 4H5v17h2v-7h5.6l.4 2h7V6h-5.6L14 4z"})
                                    "FlagOutlined"))
