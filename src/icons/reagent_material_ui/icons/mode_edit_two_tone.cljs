(ns reagent-material-ui.icons.mode-edit-two-tone
  "Imports @material-ui/icons/ModeEditTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mode-edit-two-tone (create-svg-icon [(e "path" #js {"d" "M5 18.08V19h.92l9.06-9.06-.92-.92z", "opacity" ".3"}) (e "path" #js {"d" "M3 17.25V21h3.75L17.81 9.94l-3.75-3.75L3 17.25zM5.92 19H5v-.92l9.06-9.06.92.92L5.92 19zM20.71 5.63l-2.34-2.34a.9959.9959 0 0 0-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83c.39-.39.39-1.02 0-1.41z"})]
                                         "ModeEditTwoTone"))
