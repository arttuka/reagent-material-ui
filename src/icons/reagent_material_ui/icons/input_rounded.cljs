(ns reagent-material-ui.icons.input-rounded
  "Imports @material-ui/icons/InputRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def input-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v2c0 .55.45 1 1 1s1-.45 1-1V5.98h16v12.05H4V16c0-.55-.45-1-1-1s-1 .45-1 1v2.02C2 19.11 2.89 20 3.98 20H20c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-8.15 11.15l2.79-2.79c.2-.2.2-.51 0-.71l-2.79-2.79c-.31-.32-.85-.1-.85.35V11H3c-.55 0-1 .45-1 1s.45 1 1 1h8v1.79c0 .45.54.67.85.36z"})
                                    "InputRounded"))
