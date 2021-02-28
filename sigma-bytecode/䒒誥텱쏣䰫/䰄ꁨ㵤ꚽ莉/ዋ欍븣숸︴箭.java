public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T> {
    public void \u12cb\u6b0d\ube23\uc238\ufe34\u7bad(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e p0) {
        var_4_67 : Calendar
        
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
            invokespecial:\u6198\u72f1\uc7fe\uc238\u1187\u12b2(\u6198\u72f1\uc7fe\uc238\u1187\u12b2::<init>, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, p0:\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e)
            var_4_67 = invokestatic:Calendar(Calendar::getInstance)
            
            if (cmpeq:boolean(add:int(invokevirtual:int(Calendar::get, var_4_67:Calendar, xor:int(ldc:int(17426), ldc:int(17424))), and:int(ldc:int(18637), ldc:int(5377))), ldc:int(12))) {
                if (cmpge:boolean(invokevirtual:int(Calendar::get, var_4_67:Calendar, and:int(ldc:int(8581), ldc:int(5205))), ldc:int(24))) {
                    if (cmple:boolean(invokevirtual:int(Calendar::get, var_4_67:Calendar, xor:int(ldc:int(1034), ldc:int(1039))), ldc:int(26))) {
                        putfield:boolean(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u8d90\u52d3\u6d69\u6d69\u8d90\uf995, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, xor:int[expected:boolean](ldc:int(4098), ldc:int(4099)))
                    }
                }
            }
            
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(10841), ldc:int(-11098)), ldc:int(19))), ldc:float(1.0f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(14.0f), ldc:float(10.0f), ldc:float(14.0f), ldc:float(0.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc3e3\u1187\uafe7\ub102\u71ae\ua3b4, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(-14886), ldc:int(14885)), and:int(ldc:int(14096), ldc:int(-14097)))), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f), ldc:float(14.0f), ldc:float(5.0f), ldc:float(14.0f), ldc:float(0.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc3e3\u1187\uafe7\ub102\u71ae\ua3b4, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(9.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u071d\u836c\uff55\ubff1\u8bb0\ubf56, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc3e3\u1187\uafe7\ub102\u71ae\ua3b4, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(1.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(3844), ldc:int(-3845)), and:int(ldc:int(3723), ldc:int(-3724)))), ldc:float(7.0f), ldc:float(-1.0f), ldc:float(15.0f), ldc:float(2.0f), ldc:float(4.0f), ldc:float(1.0f), ldc:float(0.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(8.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u5f50\uc238\u3e75\ubefe\u6ec6\u873d, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(22979), ldc:int(-32196)), ldc:int(19))), ldc:float(1.0f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(15.0f), ldc:float(10.0f), ldc:float(14.0f), ldc:float(0.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc2e8\u0b8e\ud158\uae87\u5f50\u6435, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(-6537), ldc:int(6536)), and:int(ldc:int(-15584), ldc:int(13387)))), ldc:float(1.0f), ldc:float(0.0f), ldc:float(0.0f), ldc:float(15.0f), ldc:float(5.0f), ldc:float(14.0f), ldc:float(0.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc2e8\u0b8e\ud158\uae87\u5f50\u6435, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(9.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u071d\u836c\uff55\ubff1\u8bb0\ubf56, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc2e8\u0b8e\ud158\uae87\u5f50\u6435, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(1.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u88c5\ub18d\u4e72\uf94d\uc246\uc229, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(12964), ldc:int(-12981)), and:int(ldc:int(-4825), ldc:int(728)))), ldc:float(15.0f), ldc:float(-1.0f), ldc:float(15.0f), ldc:float(1.0f), ldc:float(4.0f), ldc:float(1.0f), ldc:float(0.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u88c5\ub18d\u4e72\uf94d\uc246\uc229, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(8.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u839e\uc31c\u97b7\u8d90\u34df\ua3b4, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(-29733), ldc:int(29732)), ldc:int(19))), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(15.0f), ldc:float(10.0f), ldc:float(14.0f), ldc:float(0.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\ub70c\ube23\u6198\u64f2\u4492\u7d52, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(-9956), ldc:int(1763)), and:int(ldc:int(-13284), ldc:int(13283)))), ldc:float(0.0f), ldc:float(0.0f), ldc:float(0.0f), ldc:float(15.0f), ldc:float(5.0f), ldc:float(14.0f), ldc:float(0.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\ub70c\ube23\u6198\u64f2\u4492\u7d52, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(9.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u071d\u836c\uff55\ubff1\u8bb0\ubf56, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\ub70c\ube23\u6198\u64f2\u4492\u7d52, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(1.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u156b\u76bc\ub171\u385b\u52d3\u51fa, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, ldc:int(64), ldc:int(64), and:int(ldc:int(-21285), ldc:int(17188)), and:int(ldc:int(797), ldc:int(-798)))), ldc:float(0.0f), ldc:float(-1.0f), ldc:float(15.0f), ldc:float(1.0f), ldc:float(4.0f), ldc:float(1.0f), ldc:float(0.0f))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u494c\u600f\ubcb0\u5db4\u67e9\u5db4, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u156b\u76bc\ub171\u385b\u52d3\u51fa, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), ldc:float(8.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u76bc\u6435\ud217\u8cae\u8350(T extends \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 & \ub113\ufcaf\u3c25\u071d\u97b7.\ubded\u3bc9\u0800\u7bad\u72f1 p0, float p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p3, int p4, int p5) {
        var_7_61 : int
        var_9_67 : \uf9c5\ud158\u4975\uf94d\ud523\uc31c
        stack_91_0 : int [generated]
        var_7_8F : int
        var_10_91 : int
        stack_C3_0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        var_7_C1 : int
        var_11_C3 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        stack_F3_0 : \u3d4b\ub70c\uc229\u600f\ud51e\u72f1 [generated]
        var_7_124 : int
        var_12_F3 : \u3d4b\ub70c\uc229\u600f\ud51e\u72f1
        var_13_FA : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_14_115 : \u5d20\ud523\u9937\u7049\u52d3\u6b0d
        stack_142_0 : int [generated]
        var_7_140 : int
        var_15_142 : int
        var_16_156 : float
        var_17_190 : \u92ee\u3a62\u4179\u600f\u0c95<Object>
        var_7_235 : int
        var_18_1D4 : float
        var_18_1E0 : float
        var_19_1FA : int
        var_21_214 : \u6b0d\uf9c5\ucfaf\ud36e\ub102
        
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
            var_7_61 = and:int(ldc:int(23419869), ldc:int(1374911429))
            var_9_67 = invokevirtual:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ud7e8\u51fa\u7c6b\u0b8e\u8aa5\ua562, p0:T extends \ub83f\uc9f6\u47c2\u67d0\u7ce1 & \ubded\u3bc9\u0800\u7bad\u72f1[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1])
            
            if (cmpeq:boolean(var_9_67:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, aconstnull:\uf9c5\ud158\u4975\uf94d\ud523\uc31c())) {
                var_7_61 = and:int(var_7_61:int, ldc:int(-1543799059))
                stack_91_0 = and:int(ldc:int(-27116), ldc:int(2539))
            }
            else {
                stack_91_0 = xor:int(ldc:int(576), ldc:int(577))
            }
            
            var_7_8F = and:int(var_7_61:int, ldc:int(829814373))
            var_10_91 = stack_91_0:int
            
            if (cmpeq:boolean(var_10_91:int, ldc:int(0))) {
                var_7_8F = and:int(var_7_8F:int, ldc:int(1903558349))
                stack_C3_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u392e\ub70c\u4f52\ub171\u1187\u88c5)), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\ub32d\u7e3f\u5245\u446c\u6198\u7043::\u8308\u6c52\uc87f\u3dd3\ub70c\uc9f6), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)))
            }
            else {
                stack_C3_0 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u6ec6\u92ff\u8bb0\u071d\u7c6b\uafe7, p0:T extends \ub83f\uc9f6\u47c2\u67d0\u7ce1 & \ubded\u3bc9\u0800\u7bad\u72f1[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1])
            }
            
            var_7_C1 = and:int(var_7_8F:int, ldc:int(1575352287))
            var_11_C3 = stack_C3_0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d
            
            if (logicalnot:boolean(invokevirtual:boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\ud158\u4179\u4492\u0800\u416d\u927d, var_11_C3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u3d4b\ub70c\uc229\u600f\ud51e\u72f1>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u3d4b\ub70c\uc229\u600f\ud51e\u72f1>](\ub32d\u7e3f\u5245\u446c\u6198\u7043::\u8709\u7330\u69d9\u1833\u873d\ub102)))) {
                var_7_C1 = and:int(var_7_C1:int, ldc:int(729404287))
                stack_F3_0 = getstatic:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1(\u3d4b\ub70c\uc229\u600f\ud51e\u72f1::\u47c2\u8258\u6ec6\u494c\u1833\ucb79)
            }
            else {
                stack_F3_0 = checkcast:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u3d4b\ub70c\uc229\u600f\ud51e\u72f1.class, invokevirtual:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_11_C3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u3d4b\ub70c\uc229\u600f\ud51e\u72f1>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u3d4b\ub70c\uc229\u600f\ud51e\u72f1>](\ub32d\u7e3f\u5245\u446c\u6198\u7043::\u8709\u7330\u69d9\u1833\u873d\ub102)))
            }
            
            var_7_124 = and:int(var_7_C1:int, ldc:int(1341774533))
            var_12_F3 = stack_F3_0:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1
            var_13_FA = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_11_C3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
            
            if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ud523\u9937\u7049\u52d3\u6b0d.class, var_13_FA:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                var_14_115 = checkcast:\u5d20\ud523\u9937\u7049\u52d3\u6b0d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ud523\u9937\u7049\u52d3\u6b0d.class, var_13_FA:\u5d20\ud523\u9937\u7049\u52d3\u6b0d)
                
                if (cmpeq:boolean(var_12_F3:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1, getstatic:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1(\u3d4b\ub70c\uc229\u600f\ud51e\u72f1::\u47c2\u8258\u6ec6\u494c\u1833\ucb79))) {
                    var_7_124 = and:int(var_7_124:int, ldc:int(-940583329))
                    stack_142_0 = and:int(ldc:int(-31207), ldc:int(6628))
                }
                else {
                    stack_142_0 = xor:int(ldc:int(68), ldc:int(69))
                }
                
                var_7_140 = and:int(var_7_124:int, ldc:int(-1678156171))
                var_15_142 = stack_142_0:int
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                var_16_156 = invokevirtual:float(\u760c\u4975\u4179\uc246\u8640\u64f2::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_11_C3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\ub32d\u7e3f\u5245\u446c\u6198\u7043::\u8308\u6c52\uc87f\u3dd3\ub70c\uc9f6))))
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(0.5), ldc:double(0.5), ldc:double(0.5))
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\uc7fe\ub18d\ucfaf\ub7dc\ubcb0\u5140, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::\u3dd3\u6ec6\u071d\u4cd9\u7e3f\ud217), neg:float(var_16_156:float)))
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(-0.5), ldc:double(-0.5), ldc:double(-0.5))
                
                if (cmpeq:boolean(var_10_91:int, ldc:int(0))) {
                    var_7_140 = and:int(var_7_140:int, ldc:int(-34342075))
                    var_17_190 = invokedynamic:\u92ee\u3a62\u4179\u600f\u0c95<Object>(\u61a4\u74b1\ud4fe\u8258\ua562\u8640:()L\u8cae\u8bb0\ucef1\u8c8a\u3a62/\u92ee\u3a62\u4179\u600f\u0c95;)
                }
                else {
                    var_17_190 = invokevirtual:\u92ee\u3a62\u4179\u600f\u0c95(\u5d20\ud523\u9937\u7049\u52d3\u6b0d::\u6b5f\u4f52\u927d\u5d20\uc238\u7043, var_14_115:\u5d20\ud523\u9937\u7049\u52d3\u6b0d, var_11_C3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_9_67:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:T extends \ub83f\uc9f6\u47c2\u67d0\u7ce1 & \ubded\u3bc9\u0800\u7bad\u72f1[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1]), xor:int[expected:boolean](ldc:int(4372), ldc:int(4373)))
                }
                
                var_7_235 = and:int(var_7_140:int, ldc:int(-243278121))
                var_18_1D4 = sub:float(ldc:float(1.0f), invokeinterface:float(Float2FloatFunction::get, checkcast:Float2FloatFunction(it.unimi.dsi.fastutil.floats.Float2FloatFunction.class, invokeinterface:Float2FloatFunction(\u92ee\u3a62\u4179\u600f\u0c95<Object>::\u61a4\u74b1\ud4fe\u8258\ua562\u8640, var_17_190:\u92ee\u3a62\u4179\u600f\u0c95<Object>, invokestatic:\u9937\u3776\ub8be\ud51e\ub70c<\ub113\u983f\u7e3f\ud36e\uc7fe, Float2FloatFunction>(\ub32d\u7e3f\u5245\u446c\u6198\u7043::\uc87f\ub102\u99f7\u7d52\ufcaf\u6bb9, checkcast:\ubded\u3bc9\u0800\u7bad\u72f1(\ub113\ufcaf\u3c25\u071d\u97b7.\ubded\u3bc9\u0800\u7bad\u72f1.class, p0:T extends \ub83f\uc9f6\u47c2\u67d0\u7ce1 & \ubded\u3bc9\u0800\u7bad\u72f1[expected:\ubded\u3bc9\u0800\u7bad\u72f1])))), p1:float))
                var_18_1E0 = sub:float(ldc:float(1.0f), mul:float(mul:float(var_18_1D4:float, var_18_1D4:float), var_18_1D4:float))
                var_19_1FA = invokeinterface:int(Int2IntFunction::applyAsInt, checkcast:Int2IntFunction(it.unimi.dsi.fastutil.ints.Int2IntFunction.class, invokeinterface:Int2IntFunction(\u92ee\u3a62\u4179\u600f\u0c95<Object>::\u61a4\u74b1\ud4fe\u8258\ua562\u8640, var_17_190:\u92ee\u3a62\u4179\u600f\u0c95<Object>, initobject:\u51fa\u7af6\u67e9\u4e72\u5bc4\ubded<Object>[expected:\u9937\u3776\ub8be\ud51e\ub70c<? super Object, Int2IntFunction>](\u51fa\u7af6\u67e9\u4e72\u5bc4\ubded<S>::<init>))), p4:int)
                var_21_214 = invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::\ub113\uae87\uc910\u836c\u9033\u3711, invokestatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\uf995\u3e75\u946b\uf995\u4c2b\ucfaf::\u59ec\u9255\u7330\u1833\u8308\u6198, p0:T extends \ub83f\uc9f6\u47c2\u67d0\u7ce1 & \ubded\u3bc9\u0800\u7bad\u72f1[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1], var_12_F3:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1, getfield:boolean(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u8d90\u52d3\u6d69\u6d69\u8d90\uf995, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>)), p3:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokedynamic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \uf995\u4975\u1187\ubff1\u839e\u8389>(apply:()Ljava/util/function/Function;))
                
                if (cmpne:boolean(var_15_142:int, ldc:int(0))) {
                    if (cmpne:boolean(var_12_F3:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1, getstatic:\u3d4b\ub70c\uc229\u600f\ud51e\u72f1(\u3d4b\ub70c\uc229\u600f\ud51e\u72f1::\u873d\uc229\ub1b9\u6c52\u7873\u69d9))) {
                        goto(Label_0607)
                    }
                    
                    invokespecial:void(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>::\u72f1\u8df4\u6b5f\u7c6b\u6d99\uae5d, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_21_214:\u6b0d\uf9c5\ucfaf\ud36e\ub102, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\ub70c\ube23\u6198\u64f2\u4492\u7d52, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u156b\u76bc\ub171\u385b\u52d3\u51fa, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u839e\uc31c\u97b7\u8d90\u34df\ua3b4, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), var_18_1E0:float, var_19_1FA:int, p5:int)
                    goto(Label_0692)
                }
                
                Label_0539:
                
                if (cmpne:boolean(and:int(var_7_235:int, ldc:int(1)), ldc:int(0))) {
                    var_7_235 = and:int(var_7_235:int, ldc:int(-1115857177))
                    invokespecial:void(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>::\u72f1\u8df4\u6b5f\u7c6b\u6d99\uae5d, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_21_214:\u6b0d\uf9c5\ucfaf\ud36e\ub102, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc3e3\u1187\uafe7\ub102\u71ae\ua3b4, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u8d98\ub32d\ud523\u6fb0\ud7e8\u72f1, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\ud12e\ub70c\u494c\u8640\u67d0\uc84e, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), var_18_1E0:float, var_19_1FA:int, p5:int)
                    goto(Label_0692)
                }
                
                var_7_235 = and:int(var_7_235:int, ldc:int(-393888834))
                Label_0607:
                
                if (cmpne:boolean(and:int(var_7_235:int, ldc:int(131072)), ldc:int(0))) {
                    var_7_235 = and:int(var_7_235:int, ldc:int(-2036749275))
                    goto(Label_0539)
                }
                
                var_7_235 = and:int(var_7_235:int, ldc:int(-1610877225))
                invokespecial:void(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>::\u72f1\u8df4\u6b5f\u7c6b\u6d99\uae5d, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_21_214:\u6b0d\uf9c5\ucfaf\ud36e\ub102, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\uc2e8\u0b8e\ud158\uae87\u5f50\u6435, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u88c5\ub18d\u4e72\uf94d\uc246\uc229, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u12cb\u6b0d\ube23\uc238\ufe34\u7bad::\u5f50\uc238\u3e75\ubefe\u6ec6\u873d, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>), var_18_1E0:float, var_19_1FA:int, p5:int)
                Label_0692:
                var_7_124 = and:int(var_7_235:int, ldc:int(-236456971))
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u72f1\u8df4\u6b5f\u7c6b\u6d99\uae5d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e p4, float p5, int p6, int p7) {
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
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, p2:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, neg:float(mul:float(p5:float, ldc:float(1.5707964f))))
            putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, p3:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, p2:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u839e\u6c52\u4e72\u927d\u3bc9\uc3e3, p2:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p6:int, p7:int)
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u839e\u6c52\u4e72\u927d\u3bc9\uc3e3, p3:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p6:int, p7:int)
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u839e\u6c52\u4e72\u927d\u3bc9\uc3e3, p4:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p6:int, p7:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\ud523\ub83f\u3e2a\u1833\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(334047972), ldc:int(1358773367))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12cb\u6b0d\ube23\uc238\ufe34\u7bad<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1990966799))
            var_5_81 = and:int(ldc:int(-2281), ldc:int(2280))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24688), ldc:int(24623)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6C3:int, ldc:int(-1633027148))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(10633), ldc:int(16451)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(1), ldc:int(6553)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_D1:int, ldc:int(-1280739297))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16433), ldc:int(16432)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1049238928))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-720575553))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1286999939))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-994851126))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1258666435))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-61444065))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(27509881))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-135415497))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1171178878))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(598424738))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(513338460))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1621988629))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1124424254))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1521204383))
                        var_11_E2 = and:int(ldc:int(11346), ldc:int(-11347))
                        goto(Label_1616)
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1737327190))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1804096338))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1495769503))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1309898388))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1384509403))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-882166311))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1941826461))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1228367143))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1794867055))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1262561507))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-169434225))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(320516289))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2114548806))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1178863370))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-953904151))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(420565178))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1426002596))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2108800575))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-777113308))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1508899957))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(16387), ldc:int(9253))
                                goto(Label_1200)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-567323782))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1107435674))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(780807245))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2043799714))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(314795324))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1979677500))
                        var_11_E2 = and:int(ldc:int(233), ldc:int(-8938))
                    }
                    
                    Label_1200:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1877752558))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2131249557))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2098494921))
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1815691568))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1562217177))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-39415577))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1095780092))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1497)
                            }
                        }
                    }
                    
                    Label_1343:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-289819518))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-855542304))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1200)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(547795389))
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1175189121))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-205351081))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1192302473))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-35014002))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1616)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1497:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1203396789))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1949899264))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2129620500))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1616:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1627:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1117014109))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1692003879))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1559641558))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(888912910))
                        var_17_6CE = add:int(var_16_110:int, xor:int(ldc:int(4104), ldc:int(4105)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(498711973))
                
                if (cmple:boolean(var_5_81 = var_17_6CE:int, sub:int(var_6_88:int, and:int(ldc:int(8739), ldc:int(21505))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
