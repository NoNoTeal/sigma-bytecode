public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u927d\u3bc9\u93a2\uceb8\ucfaf\ua61f {
    public void \u927d\u3bc9\u93a2\uceb8\ucfaf\ua61f() {
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
            invokespecial:Object(Object::<init>, this:\u927d\u3bc9\u93a2\uceb8\ucfaf\ua61f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.lang.Object> \u8753\u4492\u624e\uc31c\u965f\uc87f(java.lang.Object p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u7e3f\u446c\u8640\u392e\ube23\ub70c p1) {
        var_5_73 : ArrayList<Object>
        var_6_79 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        var_7_89 : boolean
        var_8_99 : int
        var_9_A0 : \u7af6\u9937\u9a18\ua6bd\ud36e\u7330[]
        var_10_A9 : int
        var_10_EE : \u7af6\u9937\u9a18\ua6bd\ud36e\u7330[]
        var_11_F3 : int
        var_12_FC : int
        var_13_133 : \u7af6\u9937\u9a18\ua6bd\ud36e\u7330
        var_14_144 : \ud523\u5d20\u183a\u62da\u6d99\u836c
        var_15_164 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        
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
        
        if (instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4.class, p0:Object)) {
            var_5_73 = initobject:ArrayList<Object>(ArrayList<E>::<init>)
            var_6_79 = checkcast:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4.class, p0:Object[expected:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4])
            var_7_89 = invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, var_6_79:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))))
            var_8_99 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, var_6_79:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
            var_9_A0 = newarray:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330[](\u4492\u8aa5\ud171\uc3e3\u4c2b.\u7af6\u9937\u9a18\ua6bd\ud36e\u7330.class, var_8_99:int)
            var_10_A9 = and:int(ldc:int(-23369), ldc:int(6728))
            
            while (cmplt:boolean(var_10_A9:int, var_8_99:int)) {
                storeelement:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330(var_9_A0:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330[], var_10_A9:int, invokestatic:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\u8cae\ufe34\u1187\uf9c5\u7043\u516c, var_6_79:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_7_89:boolean))
                inc:int(var_10_A9, ldc:int(1))
            }
            
            var_10_EE = var_9_A0:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330[]
            var_11_F3 = arraylength:int(var_10_EE:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330[])
            var_12_FC = and:int(ldc:int(-25293), ldc:int(25164))
            
            while (cmplt:boolean(var_12_FC:int, var_11_F3:int)) {
                var_13_133 = loadelement:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330(var_10_EE:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330[], var_12_FC:int)
                var_14_144 = initobject:\ud523\u5d20\u183a\u62da\u6d99\u836c(\ud523\u5d20\u183a\u62da\u6d99\u836c::<init>, invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\ucfaf\ub70c\u6c52\u3e75\u6c56\ufcaf, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330)))
                invokevirtual:void(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\uc246\uc229\u6cfe\u416d\u624e\u8753, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330, checkcast:byte[](byte[].class, invokevirtual:byte[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, var_6_79:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_14_144:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>)))
                var_15_164 = initobject:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::<init>, ldc:int(33), aconstnull:ByteBuf(), invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, var_6_79:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\u7043\u8aa5\uc4d2\u946b\u7bad\u8640, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330)))
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\uc29a\u12cb\uc87f\u836c\uc238\u6b5f, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330)))
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(1153), ldc:int(857))))
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ua6bd\ubf56\u1187\ubefe\u183a), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\u0b8e\u759a\u6ec6\ud36e\ubf56\uc4d2, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330)))
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\ucfaf\ub70c\u6c52\u3e75\u6c56\ufcaf, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330)))
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_14_144:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>, invokevirtual:byte[](\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\u7bad\u51b2\u16f6\u8350\ud217\u836c, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330))
                invokeinterface:boolean(Set<Long>::add, invokevirtual:Set<Long>(\u7e3f\u446c\u8640\u392e\ube23\ub70c::\u5f50\ucef1\u4e72\u71f1\ubff1\u4daf, p1:\u7e3f\u446c\u8640\u392e\ube23\ub70c), invokestatic:Long(Long::valueOf, invokestatic:long(\u7e3f\u446c\u8640\u392e\ube23\ub70c::\u8d98\u6b0d\ub113\u61a4\u516c\u47c2, invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\u7043\u8aa5\uc4d2\u946b\u7bad\u8640, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330), invokevirtual:int(\u7af6\u9937\u9a18\ua6bd\ud36e\u7330::\uc29a\u12cb\uc87f\u836c\uc238\u6b5f, var_13_133:\u7af6\u9937\u9a18\ua6bd\ud36e\u7330))))
                invokeinterface:boolean(List<\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4>::add, var_5_73:List<\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4>, var_15_164:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                inc:int(var_12_FC, ldc:int(1))
            }
            
            return:List<Object>(var_5_73:ArrayList<Object>)
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u927d\u3bc9\u93a2\uceb8\ucfaf\ua61f::\u9a18\u6c56\ua068\u59ec\u64f2\u392e), and:int(ldc:int(25), ldc:int(-26)))), invokevirtual:Class<?>[expected:Object](Object::getClass, p0:Object)))))
    }
    
    public boolean \ub113\u8350\u3c25\u600f\u5140\u6bb9(java.lang.Class<?> p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(-25530), ldc:int(17321)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u2dcc\u67e9\u3a62\u52d3\u4d85\u4e72() {
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
            return:boolean(and:int[expected:boolean](ldc:int(161), ldc:int(20305)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_11F : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_1B8_0 : byte[] [generated]
        stack_20E_0 : byte[] [generated]
        var_4_10C : int
        var_3_111 : byte[]
        var_5_112 : int
        var_0_149 : int
        expr_131 : byte [generated]
        stack_17D_2 : byte [generated]
        stack_154_0 : byte [generated]
        expr_1BB : byte [generated]
        expr_8F : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_1FD : byte[]
        var_5_1FE : int
        var_3_D2 : String
        stack_105_0 : String[] [generated]
        expr_E4 : String[] [generated]
        
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
        var_0_11F = and:int(ldc:int(-397569036), ldc:int(-1975657743))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_131_0 = stack_1B8_0 = stack_20E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("h/hZJciAQ4fRqbitqAKvIfDbJbAKcZ3jiQBwWQ7fpa8whyHgWHcAAijw+GMl4InglZjgn+jRSRhyaL93SAhYSFiS6QAQ0OaFgJmIWChb66szK9jX")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_10C = expr_6B:int
        var_3_111 = newarray:byte[](byte.class, expr_6B:int)
        var_5_112 = expr_6B:int
        Label_0276:
        
        while (cmpeq:boolean(and:int(var_0_11F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_149 = and:int(var_0_11F:int, ldc:int(2083969981))
            var_5_112 = add:int(var_5_112:int, ldc:int(-1))
            expr_131 = stack_17D_2 = loadelement(stack_131_0, var_5_112)
            
            if (cmplt:boolean(add:int(add:int(var_5_112:int, ldc:int(5)), neg:int(var_4_10C:int)), ldc:int(0))) {
                stack_17D_2 = stack_154_0 = add:byte(expr_131:byte, loadelement:byte(var_3_111:byte[], add:int(var_5_112:int, ldc:int(5))))
                goto(Label_0356)
            }
            
            Label_0318:
            
            if (cmpeq:boolean(and:int(var_0_149:int, ldc:int(32)), ldc:int(0))) {
                var_0_149 = and:int(var_0_149:int, ldc:int(850462634))
            }
            else {
                var_0_149 = and:int(var_0_149:int, ldc:int(-732693517))
                stack_17D_2 = stack_154_0 = add:byte(expr_131:byte, ldc:byte(5))
            }
            
            Label_0356:
            
            if (cmpeq:boolean(and:int(var_0_149:int, ldc:int(4096)), ldc:int(0))) {
                var_0_149 = and:int(var_0_149:int, ldc:int(-1700805907))
                goto(Label_0318)
            }
            
            var_0_11F = and:int(var_0_149:int, ldc:int(1475084220))
            storeelement:byte(var_3_111:byte[], var_5_112:int, stack_17D_2:byte)
            
            if (cmpne:boolean(var_5_112:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_131_0 = stack_1B8_0 = stack_20E_0 = var_3_111:byte[]
            goto(Label_0112)
        }
        
        var_0_11F = and:int(var_0_11F:int, ldc:int(1839608715))
        Label_0419:
        
        while (cmpeq:boolean(and:int(var_0_11F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_11F = and:int(var_0_11F:int, ldc:int(1982198463))
            var_5_112 = add:int(var_5_112:int, ldc:int(-1))
            expr_1BB = xor:byte(loadelement:byte(stack_1B8_0:byte[], var_5_112:int), ldc:byte(52))
            storeelement:byte(var_3_111:byte[], var_5_112:int, add:int(or:int(and:int(shl:int(expr_1BB:byte, xor:int(ldc:int(1), ldc:int(5))), ldc:int(-16)), and:int(shr:int(expr_1BB:byte[expected:int], xor:int(ldc:int(-32638), ldc:int(-32634))), ldc:int(15))), ldc:int(114)))
            
            if (cmpne:boolean(var_5_112:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_131_0 = stack_1B8_0 = stack_20E_0 = var_3_111:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0276)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_11F:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_11F:int, ldc:int(8)), ldc:int(0))) {
            var_0_11F = and:int(var_0_11F:int, ldc:int(-1558567512))
        }
        else {
            var_0_11F = and:int(var_0_11F:int, ldc:int(-1860241742))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_10C = expr_8F:int
                var_3_111 = newarray:byte[](byte.class, expr_8F:int)
                var_5_112 = expr_8F:int
                goto(Label_0419)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_11F:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_11F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_11F = and:int(var_0_11F:int, ldc:int(-225773828))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_1FD = newarray:byte[](byte.class, expr_AD:int)
                var_5_1FE = expr_AD:int
                
                loop {
                    var_0_11F = and:int(var_0_11F:int, ldc:int(-77021198))
                    var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
                    storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, add:int(shl:int(loadelement:byte(stack_20E_0:byte[], var_5_1FE:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_1FE:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), ldc:int(7)), xor:int(ldc:int(-31224), ldc:int(-31223)))))
                    
                    if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_A9_0 = stack_AB_0 = stack_C6_0 = stack_131_0 = stack_1B8_0 = stack_20E_0 = var_3_1FD:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_0_11F:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_11F:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_D2 = initobject:String(String::<init>, stack_C6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_105_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(19464), ldc:int(19465)))
            expr_E4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28600), ldc:int(-28599)))
            storeelement:String(expr_E4:String[], and:int(ldc:int(18276), ldc:int(-18405)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(15506), ldc:int(-15507)), and:int(ldc:int(12371), ldc:int(19283))))
            putstatic:String[](\u927d\u3bc9\u93a2\uceb8\ucfaf\ua61f::\u9a18\u6c56\ua068\u59ec\u64f2\u392e, expr_E4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u3c25\uae87\u51b2\u6198\ud4fe\u6d69(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65F : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_66A : int
        
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
        var_3_65F = and:int(ldc:int(1087568835), ldc:int(1279319450))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u927d\u3bc9\u93a2\uceb8\ucfaf\ua61f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_65F = and:int(var_3_65F:int, ldc:int(-1445279085))
            var_5_80 = and:int(ldc:int(-2748), ldc:int(571))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1222), ldc:int(1221)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_65F:int, ldc:int(1182395543))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(513), ldc:int(512)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(1412), ldc:int(1413)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_65F = and:int(var_3_D9:int, ldc:int(-1422622789))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(-32731), ldc:int(-32732)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1905079517))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(415420782))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1061724121))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1857196921))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(2122935542))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1726078449))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1219405100))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1041044412))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1699450276))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1808683923))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-312227405))
                        var_11_EA = and:int(ldc:int(-13808), ldc:int(9615))
                        goto(Label_1508)
                    }
                    
                    Label_0582:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(842793548))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(239813233))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(283414392))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(134521478))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(185780626))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0705:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1098852040))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1153966061))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1241978381))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1630514311))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-543998204))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1893813724))
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(534013435))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1480055011))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(384), ldc:int(385))
                                goto(Label_1105)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1595680444))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1893310073))
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(943911892))
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1935627897))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1712357957))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1380416759))
                        var_11_EA = and:int(ldc:int(-18493), ldc:int(18484))
                    }
                    
                    Label_1105:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-759784548))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1810108763))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1475561583))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(776193952))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1290466769))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-583709210))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1358)
                            }
                        }
                    }
                    
                    Label_1236:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1105)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1010394483))
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1234367372))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1067165024))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(430295974))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                        goto(Label_1508)
                    }
                    
                    Label_1358:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(142212266))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1158693345))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1179960798))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(2106079670))
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(2009902082))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-2114968670))
                        loopcontinue()
                    }
                    
                    var_3_65F = and:int(var_3_65F:int, ldc:int(-557887802))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66A = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1618500677))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1645380450))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1380674087))
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-37232953))
                        var_17_66A = add:int(var_16_118:int, and:int(ldc:int(33), ldc:int(6149)))
                        looporswitchbreak()
                    }
                    
                    var_3_65F = and:int(var_3_65F:int, ldc:int(-38549307))
                }
                
                var_3_65F = and:int(var_3_65F:int, ldc:int(-26981949))
                
                if (cmple:boolean(var_5_80 = var_17_66A:int, sub:int(var_6_87:int, and:int(ldc:int(81), ldc:int(2441))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_65F = and:int(var_3_65F:int, ldc:int(-1135705730))
            goto(Label_0108)
        }
    }
}
