(ns reagent-material-ui.icons.lightbulb-sharp
  "Imports @material-ui/icons/LightbulbSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def lightbulb-sharp (create-svg-icon (e "path" #js {"d" "M12 22c1.1 0 2-.9 2-2h-4c0 1.1.9 2 2 2zm-4-5h8v2H8zm4-15C7.86 2 4.5 5.36 4.5 9.5c0 3.82 2.66 5.86 3.77 6.5h7.46c1.11-.64 3.77-2.68 3.77-6.5C19.5 5.36 16.14 2 12 2z"})
                                      "LightbulbSharp"))
