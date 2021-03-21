(ns reagent-material-ui.icons.storm-two-tone
  "Imports @material-ui/icons/StormTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def storm-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "2", "cx" "12", "opacity" ".3"}) (e "path" #js {"d" "M17.2 9C15.54 6.13 11.86 5.15 9 6.8c-2.67 1.54-3.7 4.84-2.5 7.6.09.2.19.4.3.6 1.66 2.87 5.33 3.85 8.2 2.2 2.67-1.54 3.7-4.84 2.5-7.6-.09-.2-.19-.4-.3-.6zM12 16c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4z", "opacity" ".3"}) (e "path" #js {"d" "M12 8c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm0 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"}) (e "path" #js {"d" "M18.93 8C16.72 4.18 11.82 2.87 8 5.07c-1.41.82-2.48 2-3.16 3.37-.13-2.2.22-4.4 1.02-6.44H3.74C2.2 6.49 2.52 11.58 5.07 16c1.1 1.91 2.88 3.19 4.86 3.72 1.98.53 4.16.31 6.07-.79 1.41-.82 2.48-2 3.16-3.37.13 2.2-.21 4.4-1.01 6.44h2.11c1.53-4.49 1.22-9.58-1.33-14zM15 17.2c-2.87 1.65-6.54.67-8.2-2.2-.11-.2-.21-.4-.3-.6-1.2-2.76-.17-6.06 2.5-7.6 2.86-1.65 6.54-.67 8.2 2.2.11.2.21.4.3.6 1.2 2.76.17 6.06-2.5 7.6z"}))
                                     "StormTwoTone"))
