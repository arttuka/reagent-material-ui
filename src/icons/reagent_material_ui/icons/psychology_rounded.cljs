(ns reagent-material-ui.icons.psychology-rounded
  "Imports @material-ui/icons/PsychologyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def psychology-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "10", "r" "1.5", "cx" "13"}) (e "path" #js {"d" "M13.21 3c-3.84-.11-7 2.87-7.19 6.64L4.1 12.2c-.25.33-.01.8.4.8H6v3c0 1.1.9 2 2 2h1v2c0 .55.45 1 1 1h5c.55 0 1-.45 1-1v-3.68c2.44-1.16 4.1-3.68 4-6.58-.14-3.62-3.18-6.63-6.79-6.74zM16 10c0 .13-.02.25-.04.38l.65.49c.2.15.26.43.13.65l-.56.97c-.13.22-.4.31-.63.21l-.75-.32c-.2.15-.42.29-.66.39l-.1.79c-.03.25-.24.44-.5.44h-1.12c-.25 0-.46-.19-.5-.44l-.1-.79c-.24-.1-.45-.24-.66-.39l-.75.32c-.23.1-.5.01-.63-.21l-.56-.97c-.13-.22-.07-.5.13-.65l.65-.49c.02-.13 0-.25 0-.38s.02-.25.04-.38l-.66-.49c-.2-.15-.25-.43-.13-.65l.56-.97c.13-.22.4-.31.63-.21l.75.32c.2-.15.42-.29.66-.39l.1-.79c.02-.25.23-.44.49-.44h1.12c.25 0 .46.19.5.44l.1.79c.24.1.45.24.66.39l.75-.32c.23-.1.5-.01.63.21l.56.97c.13.22.07.5-.13.65l-.65.49c-.01.13.02.25.02.38z"}))
                                         "PsychologyRounded"))
