(ns reagent-material-ui.icons.rv-hookup-rounded
  "Imports @material-ui/icons/RvHookupRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def rv-hookup-rounded (create-svg-icon (e "path" #js {"d" "M19.9 16.21V17h-3V7c0-1.1-.9-2-2-2h-12c-.55 0-1 .45-1 1s.45 1 1 1h5v3h-6v6c0 1.65 1.35 3 3 3h1.18c.42 1.16 1.52 2 2.82 2s2.4-.84 2.82-2h8.19v.78c0 .45.54.67.85.36l1.79-1.79c.2-.2.2-.51 0-.71l-1.79-1.79c-.32-.31-.86-.09-.86.36zM9.9 7h5v3h-5V7zm-1 12c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                        "RvHookupRounded"))
