public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u385b\uceb8\ua6bd\ucb79\u62da {
    public void \u385b\uceb8\ua6bd\ucb79\u62da(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2) {
        var_6_88 : int
        var_7_93 : Iterator<String>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u385b\uceb8\ua6bd\ucb79\u62da)
            putfield:Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>(\u385b\uceb8\ua6bd\ucb79\u62da::\u64ab\u16f6\u516c\ua562\u156b\u3d64, this:\u385b\uceb8\ua6bd\ucb79\u62da, invokestatic:HashMap[expected:Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>](Maps::newHashMap))
            putfield:Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>(\u385b\uceb8\ua6bd\ucb79\u62da::\uc84e\u1833\u62da\u4f52\ub171\u183a, this:\u385b\uceb8\ua6bd\ucb79\u62da, invokestatic:HashMap[expected:Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>](Maps::newHashMap))
            putfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u494c\u8cae\uc29a\u983f\ud12e\uc9f6, this:\u385b\uceb8\ua6bd\ucb79\u62da, p1:List<String>)
            putfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u183a\u983f\ua3b4\u40a9\u836c\u5140, this:\u385b\uceb8\ua6bd\ucb79\u62da, p2:List<String>)
            invokespecial:void(\u385b\uceb8\ua6bd\ucb79\u62da::\uc2e8\u516c\u9033\ub83f\uff55\ub83f, this:\u385b\uceb8\ua6bd\ucb79\u62da, p0:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113)
            var_6_88 = and:int(ldc:int(10670), ldc:int(-10671))
            var_7_93 = invokeinterface:Iterator<String>(List<String>::iterator, getfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u183a\u983f\ua3b4\u40a9\u836c\u5140, this:\u385b\uceb8\ua6bd\ucb79\u62da))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_93:Iterator<String>)) {
                var_6_88 = or:int(var_6_88:boolean[expected:int], ternaryop:int(cmpeq:boolean(invokeinterface:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>(Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>::get, getfield:Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>(\u385b\uceb8\ua6bd\ucb79\u62da::\u64ab\u16f6\u516c\ua562\u156b\u3d64, this:\u385b\uceb8\ua6bd\ucb79\u62da), checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_93:Iterator<String>))), aconstnull:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>()), and:int(ldc:int(8359), ldc:int(-8360)), and:int(ldc:int(17473), ldc:int(2579))))
            }
            
            putfield:boolean(\u385b\uceb8\ua6bd\ucb79\u62da::\uc2e8\u7873\u6b5f\u4d85\ua6bd\u6ec6, this:\u385b\uceb8\ua6bd\ucb79\u62da, var_6_88:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3776\u6d69\u385b\uc31c\u0a06\u88c5(long p0) {
        var_3_5F : int
        var_5_69 : Iterator<String>
        var_3_76 : int
        var_7_BC : \u7e3f\u8389\u4f52\ua61f\ucfaf
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_5F = and:int(ldc:int(-1786686803), ldc:int(-1721371715))
            var_5_69 = invokeinterface:Iterator<String>(List<String>::iterator, getfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u494c\u8cae\uc29a\u983f\ud12e\uc9f6, this:\u385b\uceb8\ua6bd\ucb79\u62da))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_76 = and:int(var_3_5F:int, ldc:int(-1082404546))
                }
                else {
                    var_3_76 = and:int(var_3_5F:int, ldc:int(-1615489427))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_69:Iterator<String>)) {
                        var_7_BC = checkcast:\u7e3f\u8389\u4f52\ua61f\ucfaf(\ud36e\u6bb9\u960f\u4c04\u64ab.\u7e3f\u8389\u4f52\ua61f\ucfaf.class, invokeinterface:\u7e3f\u8389\u4f52\ua61f\ucfaf(Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>::get, getfield:Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>(\u385b\uceb8\ua6bd\ucb79\u62da::\uc84e\u1833\u62da\u4f52\ub171\u183a, this:\u385b\uceb8\ua6bd\ucb79\u62da), checkcast:String[expected:Object](java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_69:Iterator<String>))))
                        
                        if (cmpne:boolean(var_7_BC:\u7e3f\u8389\u4f52\ua61f\ucfaf, aconstnull:\u7e3f\u8389\u4f52\ua61f\ucfaf())) {
                            if (invokevirtual:boolean(\u7e3f\u8389\u4f52\ua61f\ucfaf::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, var_7_BC:\u7e3f\u8389\u4f52\ua61f\ucfaf, p0:long)) {
                                invokevirtual:void(\u7e3f\u8389\u4f52\ua61f\ucfaf::\u7e3f\ud158\uc4d2\u1833\u51b2\u965f, var_7_BC:\u7e3f\u8389\u4f52\ua61f\ucfaf, p0:long)
                                invokevirtual:void(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\u9033\u5fe1\u416d\u5f50\uff55\ub1b9, var_7_BC:\u7e3f\u8389\u4f52\ua61f\ucfaf[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217])
                            }
                        }
                        
                        var_3_5F = and:int(var_3_76:int, ldc:int(-1515399267))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_76:int, ldc:int(2097152)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_76:int, ldc:int(-1822835960))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ua6bd\u7af6\u7bad\u6cfe\u4f52\uc84e(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_2_5F : int
        var_4_6F : \uc31c\uc87f\uc246\u3776\ub7dc
        var_5_98 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_2_1F0 : int
        var_6_C0 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_D2 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_DD : Iterator<String>
        var_9_14C : String
        var_10_161 : \u5654\u9937\u72f1\ud4fe\u0c95
        var_12_192 : LongArrayList
        var_13_19C : int
        var_14_1E3 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(2069190160), ldc:int(-93183449))
            var_4_6F = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(4924), ldc:int(-21310))))
            var_5_98 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_4_6F:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(1040), ldc:int(1041)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, var_4_6F:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(16966), ldc:int(1282)))))
            
            if (invokespecial:boolean(\u385b\uceb8\ua6bd\ucb79\u62da::\ud51e\ud51e\uae5d\u6cfe\u385b\u4daf, this:\u385b\uceb8\ua6bd\ucb79\u62da, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))) {
                p0 = invokespecial:\uc31c\uc87f\uc246\u3776\ub7dc(\u385b\uceb8\ua6bd\ucb79\u62da::\u51fa\uc2bd\u446c\u983f\u7ce1\u52d3, this:\u385b\uceb8\ua6bd\ucb79\u62da, p0:\uc31c\uc87f\uc246\u3776\ub7dc, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            }
            
            var_2_1F0 = and:int(var_2_5F:int, ldc:int(2044568653))
            var_6_C0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_4_6F:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(4931), ldc:int(26763))))
            var_7_D2 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_6_C0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(1025), ldc:int(1029))))
            var_8_DD = invokeinterface:Iterator<String>(List<String>::iterator, getfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u183a\u983f\ua3b4\u40a9\u836c\u5140, this:\u385b\uceb8\ua6bd\ucb79\u62da))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_8_DD:Iterator)) {
                var_9_14C = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_DD:Iterator<String>))
                var_10_161 = checkcast:\u5654\u9937\u72f1\ud4fe\u0c95(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95.class, invokeinterface:Object[expected:\u5654\u9937\u72f1\ud4fe\u0c95](BiMap::get, getstatic:BiMap<String, \u5654\u9937\u72f1\ud4fe\u0c95<?>>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub1b9\uc229\ub6ab\ud51e\u624e\u6bb9), invokevirtual:String[expected:Object](String::toLowerCase, var_9_14C:String, getstatic:Locale(Locale::ROOT))))
                
                if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_7_D2:\uc31c\uc87f\uc246\u3776\ub7dc, var_9_14C:String, ldc:int(12)))) {
                    if (cmpne:boolean(var_10_161:\u5654\u9937\u72f1\ud4fe\u0c95, aconstnull:\u5654\u9937\u72f1\ud4fe\u0c95())) {
                        var_12_192 = initobject:LongArrayList(LongArrayList::<init>)
                        var_13_19C = sub:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(8))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_2_1F0 = and:int(var_2_1F0:int, ldc:int(2068970534))
                                
                                if (cmple:boolean(var_13_19C:int, add:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(8)))) {
                                    var_14_1E3 = sub:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(8))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(1073741824)), ldc:int(0))) {
                                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-162159886))
                                            
                                            if (cmple:boolean(var_14_1E3:int, add:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, var_5_98:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(8)))) {
                                                if (invokespecial:boolean(\u385b\uceb8\ua6bd\ucb79\u62da::\u4975\u8753\ucb79\u6b0d\u527a\uc910, this:\u385b\uceb8\ua6bd\ucb79\u62da, var_13_19C:int, var_14_1E3:int, var_9_14C:String)) {
                                                    invokeinterface:boolean(LongList::add, var_12_192:LongList, invokestatic:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, var_13_19C:int, var_14_1E3:int))
                                                }
                                                
                                                var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-239843961))
                                                inc:int(var_14_1E3, ldc:int(1))
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_1F0:int, ldc:int(8388608)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-972829961))
                                    }
                                    
                                    var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1928450263))
                                    inc:int(var_13_19C, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_2_1F0:int, ldc:int(1048576)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_1F0 = and:int(var_2_1F0:int, ldc:int(-79871618))
                        }
                        
                        var_2_1F0 = and:int(var_2_1F0:int, ldc:int(2069486619))
                        invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u392e\u4179\u5f50\u9af2\ubb2b\u40a9, var_7_D2:\uc31c\uc87f\uc246\u3776\ub7dc, var_9_14C:String, var_12_192:List<Long>)
                    }
                }
                
                var_2_1F0 = and:int(var_2_1F0:int, ldc:int(1891414581))
            }
            
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_6_C0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(4130), ldc:int(4134))), var_7_D2:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_4_6F:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(13058), ldc:int(13057))), var_6_C0:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(10806), ldc:int(-10807))), var_4_6F:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            return:\uc31c\uc87f\uc246\u3776\ub7dc(p0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u4975\u8753\ucb79\u6b0d\u527a\uc910(int p0, int p1, java.lang.String p2) {
        var_4_9D : int
        stack_F1_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_9D = and:int(ldc:int(-837564962), ldc:int(-1349008551))
        
        if (getfield:boolean(\u385b\uceb8\ua6bd\ucb79\u62da::\uc2e8\u7873\u6b5f\u4d85\ua6bd\u6ec6, this:\u385b\uceb8\ua6bd\ucb79\u62da)) {
            loop {
                if (cmpne:boolean(and:int(var_4_9D:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_9D = and:int(var_4_9D:int, ldc:int(-1359752339))
                    
                    if (cmpne:boolean(invokeinterface:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>(Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>::get, getfield:Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>(\u385b\uceb8\ua6bd\ucb79\u62da::\u64ab\u16f6\u516c\ua562\u156b\u3d64, this:\u385b\uceb8\ua6bd\ucb79\u62da), p2:String[expected:Object]), aconstnull:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>())) {
                        if (invokevirtual:boolean(\u7e3f\u8389\u4f52\ua61f\ucfaf::\u6c56\uafe7\ucfaf\ubcb0\u4ab3\uc9f6, checkcast:\u7e3f\u8389\u4f52\ua61f\ucfaf(\ud36e\u6bb9\u960f\u4c04\u64ab.\u7e3f\u8389\u4f52\ua61f\ucfaf.class, invokeinterface:\u7e3f\u8389\u4f52\ua61f\ucfaf(Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>::get, getfield:Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>(\u385b\uceb8\ua6bd\ucb79\u62da::\uc84e\u1833\u62da\u4f52\ub171\u183a, this:\u385b\uceb8\ua6bd\ucb79\u62da), invokeinterface:String[expected:Object](Map<String, String>::get, getstatic:Map<String, String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u3c25\u9af2\ud4fe\u56bd\u946b\ud217), p2:String[expected:Object]))), invokestatic:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p0:int, p1:int))) {
                            stack_F1_0 = xor:int(ldc:int(8248), ldc:int(8249))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_9D:int, ldc:int(512)), ldc:int(0))) {
                    var_4_9D = and:int(var_4_9D:int, ldc:int(1609690955))
                    stack_F1_0 = and:int(ldc:int(18675), ldc:int(-18676))
                    looporswitchbreak()
                }
                
                var_4_9D = and:int(var_4_9D:int, ldc:int(-968089194))
            }
            
            return:boolean(stack_F1_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(7310), ldc:int(-23695)))
    }
    
    private boolean \ud51e\ud51e\uae5d\u6cfe\u385b\u4daf(int p0, int p1) {
        var_3_5F : int
        var_3_6B : int
        var_5_75 : Iterator<String>
        var_6_B2 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_5F = and:int(ldc:int(-901113689), ldc:int(-360031961))
        
        if (getfield:boolean(\u385b\uceb8\ua6bd\ucb79\u62da::\uc2e8\u7873\u6b5f\u4d85\ua6bd\u6ec6, this:\u385b\uceb8\ua6bd\ucb79\u62da)) {
            var_3_6B = and:int(var_3_5F:int, ldc:int(1250821995))
            var_5_75 = invokeinterface:Iterator<String>(List<String>::iterator, getfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u183a\u983f\ua3b4\u40a9\u836c\u5140, this:\u385b\uceb8\ua6bd\ucb79\u62da))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_75:Iterator<String>)) {
                var_6_B2 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_75:Iterator<String>))
                
                if (logicaland:boolean(cmpne:boolean(invokeinterface:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>(Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>::get, getfield:Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>(\u385b\uceb8\ua6bd\ucb79\u62da::\u64ab\u16f6\u516c\ua562\u156b\u3d64, this:\u385b\uceb8\ua6bd\ucb79\u62da), var_6_B2:String[expected:Object]), aconstnull:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>()), invokevirtual:boolean(\u7e3f\u8389\u4f52\ua61f\ucfaf::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, checkcast:\u7e3f\u8389\u4f52\ua61f\ucfaf(\ud36e\u6bb9\u960f\u4c04\u64ab.\u7e3f\u8389\u4f52\ua61f\ucfaf.class, invokeinterface:\u7e3f\u8389\u4f52\ua61f\ucfaf(Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>::get, getfield:Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>(\u385b\uceb8\ua6bd\ucb79\u62da::\uc84e\u1833\u62da\u4f52\ub171\u183a, this:\u385b\uceb8\ua6bd\ucb79\u62da), invokeinterface:String(Map<String, String>::get, getstatic:Map<String, String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u3c25\u9af2\ud4fe\u56bd\u946b\ud217), var_6_B2:String[expected:Object]))), invokestatic:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p0:int, p1:int)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(2721), ldc:int(17411)))
                }
                
                var_3_6B = and:int(var_3_6B:int, ldc:int(1272936635))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-18169), ldc:int(18096)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-25259), ldc:int(25258)))
    }
    
    private \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u51fa\uc2bd\u446c\u983f\u7ce1\u52d3(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1) {
        var_3_5F : int
        var_5_6F : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_81 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_93 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_9E : Iterator<String>
        var_3_AB : int
        var_9_11A : String
        var_10_12A : Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>
        var_11_141 : long
        var_13_174 : \uc31c\uc87f\uc246\u3776\ub7dc
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_5F = and:int(ldc:int(-438402036), ldc:int(-438930580))
            var_5_6F = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(-6914), ldc:int(6913))))
            var_6_81 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_5_6F:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(16387), ldc:int(35))))
            var_7_93 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_6_81:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(4480), ldc:int(4485))))
            var_8_9E = invokeinterface:Iterator<String>(List<String>::iterator, getfield:List<String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u183a\u983f\ua3b4\u40a9\u836c\u5140, this:\u385b\uceb8\ua6bd\ucb79\u62da))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_AB = and:int(var_3_5F:int, ldc:int(-84183564))
                }
                else {
                    var_3_AB = and:int(var_3_5F:int, ldc:int(-973815112))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_9E:Iterator<String>)) {
                        var_9_11A = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_9E:Iterator<String>))
                        var_10_12A = checkcast:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>(it.unimi.dsi.fastutil.longs.Long2ObjectMap<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc>.class, invokeinterface:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>(Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>::get, getfield:Map<String, Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>>(\u385b\uceb8\ua6bd\ucb79\u62da::\u64ab\u16f6\u516c\ua562\u156b\u3d64, this:\u385b\uceb8\ua6bd\ucb79\u62da), var_9_11A:String[expected:Object]))
                        
                        if (cmpne:boolean(var_10_12A:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>, aconstnull:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>())) {
                            var_11_141 = invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
                            
                            if (invokevirtual:boolean(\u7e3f\u8389\u4f52\ua61f\ucfaf::\uceb8\u88c5\u51b2\u6fb0\uf995\u7c6b, checkcast:\u7e3f\u8389\u4f52\ua61f\ucfaf(\ud36e\u6bb9\u960f\u4c04\u64ab.\u7e3f\u8389\u4f52\ua61f\ucfaf.class, invokeinterface:\u7e3f\u8389\u4f52\ua61f\ucfaf(Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>::get, getfield:Map<String, \u7e3f\u8389\u4f52\ua61f\ucfaf>(\u385b\uceb8\ua6bd\ucb79\u62da::\uc84e\u1833\u62da\u4f52\ub171\u183a, this:\u385b\uceb8\ua6bd\ucb79\u62da), invokeinterface:String[expected:Object](Map<String, String>::get, getstatic:Map<String, String>(\u385b\uceb8\ua6bd\ucb79\u62da::\u3c25\u9af2\ud4fe\u56bd\u946b\ud217), var_9_11A:String[expected:Object]))), var_11_141:long)) {
                                var_13_174 = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokeinterface:Object[expected:\uc31c\uc87f\uc246\u3776\ub7dc](Long2ObjectMap::get, var_10_12A:Long2ObjectMap<\uc31c\uc87f\uc246\u3776\ub7dc>, var_11_141:long))
                                
                                if (cmpne:boolean(var_13_174:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                                    invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_7_93:\uc31c\uc87f\uc246\u3776\ub7dc, var_9_11A:String, var_13_174:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                                }
                            }
                        }
                        
                        var_3_5F = and:int(var_3_AB:int, ldc:int(1706513420))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_AB:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_AB:int, ldc:int(1815593051))
            }
            
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_6_81:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(-12280), ldc:int(-12275))), var_7_93:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_5_6F:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(-32756), ldc:int(-32753))), var_6_81:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(1376), ldc:int(-1377))), var_5_6F:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            return:\uc31c\uc87f\uc246\u3776\ub7dc(p0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    private void \uc2e8\u516c\u9033\ub83f\uff55\ub83f(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u385b\uceb8\ua6bd\ucb79\u62da \ubded\u62da\u97e6\uc3e3\uae87\u34df(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 p1) {
        var_2_76 : int
        var_4_199 : ImmutableList
        stack_C5_0 : String [generated]
        expr_B8 : Object[] [generated]
        var_4_1BD : ImmutableList
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_76 = and:int(ldc:int(1342131241), ldc:int(-2103104374))
        
        if (cmpeq:boolean(p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e))) {
            return:\u385b\uceb8\ua6bd\ucb79\u62da(initobject:\u385b\uceb8\ua6bd\ucb79\u62da(\u385b\uceb8\ua6bd\ucb79\u62da::<init>, p1:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, invokestatic:ImmutableList[expected:List<String>](ImmutableList::of, loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(4097), ldc:int(4108))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(78), ldc:int(4271))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(8303), ldc:int(4623))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(4287), ldc:int(4271))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(4369), ldc:int(25779))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(5401), ldc:int(5387)))), invokestatic:ImmutableList[expected:List<String>](ImmutableList::of, loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(1679), ldc:int(4207))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(16562), ldc:int(784))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(-28630), ldc:int(-28616))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(18515), ldc:int(19))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(2172), ldc:int(2152))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(4149), ldc:int(8405))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(17160), ldc:int(17182))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(16558), ldc:int(8286))), loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(16470), ldc:int(16475))))))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_76:int, ldc:int(8)), ldc:int(0))) {
                var_2_76 = and:int(var_2_76:int, ldc:int(-1830286612))
                
                if (cmpeq:boolean(p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79))) {
                    var_4_199 = invokestatic:ImmutableList(ImmutableList::of, loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(7191), ldc:int(663))))
                    return:\u385b\uceb8\ua6bd\ucb79\u62da(initobject:\u385b\uceb8\ua6bd\ucb79\u62da(\u385b\uceb8\ua6bd\ucb79\u62da::<init>, p1:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, var_4_199:List<String>, var_4_199:List<String>))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_76:int, ldc:int(128)), ldc:int(0))) {
                var_2_76 = and:int(var_2_76:int, ldc:int(-514079189))
            }
            else {
                if (cmpne:boolean(p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b))) {
                    stack_C5_0 = loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(26647), ldc:int(26638)))
                    expr_B8 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(771), ldc:int(8257)))
                    storeelement:Object(expr_B8:Object[], and:int(ldc:int(-14722), ldc:int(14721)), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object])
                    athrow(initobject:RuntimeException(RuntimeException::<init>, invokestatic:String(String::format, stack_C5_0:String, expr_B8:Object[])))
                }
                
                var_4_1BD = invokestatic:ImmutableList(ImmutableList::of, loadelement:String[expected:Object](getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(2200), ldc:int(1080))))
                return:\u385b\uceb8\ua6bd\ucb79\u62da(initobject:\u385b\uceb8\ua6bd\ucb79\u62da(\u385b\uceb8\ua6bd\ucb79\u62da::<init>, p1:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113, var_4_1BD:List<String>, var_4_1BD:List<String>))
            }
        }
    }
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\u7e3f\u8389\u4f52\ua61f\ucfaf lambda$\u47c2\uceb8\u36d3\u64f2\u51b2\u8413$3(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u7e3f\u8389\u4f52\ua61f\ucfaf(initobject:\u7e3f\u8389\u4f52\ua61f\ucfaf(\u7e3f\u8389\u4f52\ua61f\ucfaf::<init>, p0:String))
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.longs.Long2ObjectMap lambda$\u52d3\u8640\u3bd6\u8350\uf995\u516c$2(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Long2ObjectMap(initobject:Long2ObjectOpenHashMap[expected:Long2ObjectMap](Long2ObjectOpenHashMap::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5245\u5bc4\ua068\ubcb0\u527a\u5fe1$1(java.util.HashMap p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(20538), ldc:int(3358))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(19464), ldc:int(19483))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(571), ldc:int(1307))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(4123), ldc:int(4111))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(4717), ldc:int(4721))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(4157), ldc:int(18519))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(541), ldc:int(16479))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(7446), ldc:int(25110))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u16f6\u72f1\u836c\uc9f6\ud158\u760c$0(java.util.HashMap p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(648), ldc:int(647))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(18571), ldc:int(18564))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(-15327), ldc:int(-15311))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(1102), ldc:int(1118))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(17170), ldc:int(6202))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(10294), ldc:int(17811))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(3155), ldc:int(8723))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(-24051), ldc:int(-24036))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(18580), ldc:int(8476))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(448), ldc:int(465))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(12619), ldc:int(12638))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(17169), ldc:int(14487))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(20511), ldc:int(20489))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(147), ldc:int(797))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(128), ldc:int(142))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(24584), ldc:int(24582))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(-32216), ldc:int(-32219))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(29), ldc:int(23663))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(11615), ldc:int(4151))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), and:int(ldc:int(671), ldc:int(24855))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(152), ldc:int(128))), loadelement:String(getstatic:String[](\u385b\uceb8\ua6bd\ucb79\u62da::\ubded\u4bc8\u8389\u56bd\u0b8e\u6bb9), xor:int(ldc:int(24576), ldc:int(24600))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \ua562\u40a9\ub102\u8753\u0b8e\u3504(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_655 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_64A = and:int(ldc:int(-1032697875), ldc:int(947652509))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u385b\uceb8\ua6bd\ucb79\u62da[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(343343021))
            var_5_80 = and:int(ldc:int(7734), ldc:int(-15999))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27297), ldc:int(27296)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_64A:int, ldc:int(-1095661925))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(4097), ldc:int(1243)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(1088), ldc:int(1089)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_64A = and:int(var_3_D0:int, ldc:int(1610071997))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(19584), ldc:int(19585)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1320159623))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-976909734))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-2036959369))
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1209033226))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(386288846))
                        goto(Label_0667)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-58835285))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0560)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1126317719))
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1212199681))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-815318806))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0667)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1878070959))
                            var_11_E1 = and:int(ldc:int(95), ldc:int(-352))
                            goto(Label_1496)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0560:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1842478939))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1661676584))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1227927209))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0667:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-273415431))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-722594799))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(350498776))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1680574098))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1888076591))
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-2005147799))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(91936653))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1560115415))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(302694109))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-737579149))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1553719865))
                            goto(Label_0667)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(270530873))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-377858359))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(85), ldc:int(18465))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0948:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1697305234))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-277083751))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0667)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1905854755))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1836470187))
                        var_11_E1 = and:int(ldc:int(9326), ldc:int(-13423))
                    }
                    
                    Label_1097:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-338479886))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1553413691))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0667)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1379652853))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-652152962))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1331389825))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1996437451))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1346)
                            }
                        }
                    }
                    
                    Label_1229:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1097)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1258404239))
                            goto(Label_0948)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0667)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(768954965))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1035181741))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1496)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1346:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-516377402))
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1847532722))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1292718300))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1252718647))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-358419169))
                        goto(Label_0667)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1194771506))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64A = and:int(var_3_64A:int, ldc:int(-2018498903))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1496:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_655 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1507:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0667)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-509045860))
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1403778412))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1430858067))
                        var_17_655 = add:int(var_16_10F:int, and:int(ldc:int(33), ldc:int(27793)))
                        looporswitchbreak()
                    }
                    
                    var_3_64A = and:int(var_3_64A:int, ldc:int(1247398470))
                }
                
                var_3_64A = and:int(var_3_64A:int, ldc:int(775769995))
                
                if (cmple:boolean(var_5_80 = var_17_655:int, sub:int(var_6_87:int, xor:int(ldc:int(2272), ldc:int(2273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
