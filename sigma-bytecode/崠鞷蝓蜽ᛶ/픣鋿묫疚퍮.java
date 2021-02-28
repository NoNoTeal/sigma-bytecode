public class \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e {
    public void \ud523\u92ff\ubb2b\u759a\ud36e(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 p2) {
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
            invokespecial:\ud523\u92ff\ubb2b\u759a\ud36e(\ud523\u92ff\ubb2b\u759a\ud36e::<init>, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p2:\u8df4\u446c\u6d69\u5fe1\u64f2, getstatic:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa::\ubf56\u40a9\u76bc\ua3b4\u5d20\u97e6), invokestatic:\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>[expected:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>::\u071d\u385b\u7049\uae5d\uc84e\u1833), invokestatic:\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>[expected:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>::\u071d\u385b\u7049\uae5d\uc84e\u1833), ldc:long(0L), checkcast:\uc29a\u6198\u6bb9\u4492\u965f[](\u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f[].class, aconstnull:\uc29a\u6198\u6bb9\u4492\u965f[]()), checkcast:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>(java.util.function.Consumer<\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e>.class, aconstnull:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u92ff\ubb2b\u759a\ud36e(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa p3, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p4, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> p5, long p6, \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f[] p7, java.util.function.Consumer<\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e> p8) {
        var_13_B7 : \ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[]
        var_14_BC : int
        var_15_C5 : int
        var_16_EB : \ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9
        var_13_DD : int
        
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
            invokespecial:Object(Object::<init>, this:\ud523\u92ff\ubb2b\u759a\ud36e)
            putfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e, newarray:\uc29a\u6198\u6bb9\u4492\u965f[](\u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f.class, ldc:int(16)))
            putfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokestatic:HashMap[expected:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>](Maps::newHashMap))
            putfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokestatic:EnumMap[expected:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>](Maps::newEnumMap, ldc:Class<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9.class)))
            putfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokestatic:HashMap[expected:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>](Maps::newHashMap))
            putfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\ud523\u92ff\ubb2b\u759a\ud36e::\ub171\u8308\u8753\u71ae\u5d20\ucfaf, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokestatic:HashMap[expected:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>](Maps::newHashMap))
            putfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\ud523\u92ff\ubb2b\u759a\ud36e::\uc7fe\ub102\u72f1\u7049\u416d\u647c, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokestatic:HashMap[expected:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>](Maps::newHashMap))
            putfield:ShortList[](\ud523\u92ff\ubb2b\u759a\ud36e::\u927d\u7ce1\u927d\uc7fe\u7006\u4c2b, this:\ud523\u92ff\ubb2b\u759a\ud36e, newarray:ShortList[](it.unimi.dsi.fastutil.shorts.ShortList.class, ldc:int(16)))
            putfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e, newarray:\u9255\ubf56\u4d85\u873d\u3711\u6198[](\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u9255\ubf56\u4d85\u873d\u3711\u6198.class, ldc:int(16)))
            putfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c)
            putfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            putfield:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(\ud523\u92ff\ubb2b\u759a\ud36e::\u5fe1\uc2bd\uae5d\u12cb\uc2bd\u4975, this:\ud523\u92ff\ubb2b\u759a\ud36e, p3:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa)
            var_13_B7 = invokestatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[](\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::values)
            var_14_BC = arraylength:int(var_13_B7:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[])
            var_15_C5 = and:int(ldc:int(-21855), ldc:int(21780))
            
            while (cmplt:boolean(var_15_C5:int, var_14_BC:int)) {
                var_16_EB = loadelement:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(var_13_B7:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[], var_15_C5:int)
                
                if (invokevirtual:boolean(AbstractCollection<E>::contains, invokevirtual:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>[expected:AbstractCollection<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>](\ucb79\u7ce1\ubded\u3d64\ub171::\u385b\u74b1\uc4d2\ubcb0\u8d98\u51fa, getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068)), var_16_EB:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object])) {
                    invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::put, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_16_EB:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, initobject:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u8df4\u7ce1\ub6ab\u5245\u7d52::<init>, this:\ud523\u92ff\ubb2b\u759a\ud36e[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52], var_16_EB:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9))
                }
                
                inc:int(var_15_C5, ldc:int(1))
            }
            
            var_13_DD = and:int(ldc:int(-32763), ldc:int(30688))
            
            while (cmplt:boolean(var_13_DD:int, arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                storeelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_13_DD:int, initobject:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>::<init>, ldc:Class<\u7d52\u718f\u3776\u6fb0\ub83f>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class)))
                inc:int(var_13_DD, ldc:int(1))
            }
            
            putfield:\u8df4\u446c\u6d69\u5fe1\u64f2(\ud523\u92ff\ubb2b\u759a\ud36e::\u98a4\u516c\ud4fe\u392e\u3bd6\u4e72, this:\ud523\u92ff\ubb2b\u759a\ud36e, p2:\u8df4\u446c\u6d69\u5fe1\u64f2)
            putfield:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud523\u92ff\ubb2b\u759a\ud36e::\u51fa\ub171\u385b\u97b7\u3a62\u7c6b, this:\ud523\u92ff\ubb2b\u759a\ud36e, p4:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)
            putfield:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ud523\u92ff\ubb2b\u759a\ud36e::\u51b2\uc4d2\u4daf\u4ab3\uc4d2\u7873, this:\ud523\u92ff\ubb2b\u759a\ud36e, p5:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>)
            putfield:long(\ud523\u92ff\ubb2b\u759a\ud36e::\u7d52\u5245\ud51e\ub70c\u6c56\u67d0, this:\ud523\u92ff\ubb2b\u759a\ud36e, p6:long)
            putfield:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>(\ud523\u92ff\ubb2b\u759a\ud36e::\u6b5f\u59ec\u3c25\u7330\u494c\u4179, this:\ud523\u92ff\ubb2b\u759a\ud36e, p8:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>)
            
            if (cmpne:boolean(p7:\uc29a\u6198\u6bb9\u4492\u965f[], aconstnull:\uc29a\u6198\u6bb9\u4492\u965f[]())) {
                if (cmpne:boolean(arraylength:int(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e)), arraylength:int(p7:\uc29a\u6198\u6bb9\u4492\u965f[]))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\ud523\u92ff\ubb2b\u759a\ud36e::\u4492\uc84e\ubf56\u9033\u9033\u9af2), loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), and:int(ldc:int(30816), ldc:int(-30817))), invokestatic:Integer[expected:Object](Integer::valueOf, arraylength:int(p7:\uc29a\u6198\u6bb9\u4492\u965f[])), invokestatic:Integer[expected:Object](Integer::valueOf, arraylength:int(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e))))
                }
                else {
                    invokestatic:void(System::arraycopy, p7:\uc29a\u6198\u6bb9\u4492\u965f[][expected:Object], and:int(ldc:int(31841), ldc:int(-31850)), getfield:\uc29a\u6198\u6bb9\u4492\u965f[][expected:Object](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e), and:int(ldc:int(25044), ldc:int(-26078)), arraylength:int(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u92ff\ubb2b\u759a\ud36e(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049 p1) {
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
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52 \ub70c\uc84e\u9937\u759a\u385b\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0) {
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
    
    public java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u839e\u67d0\u71f1\u4c2b\u3dd3\u156b() {
        var_3_6E : HashSet
        
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
            var_3_6E = invokestatic:HashSet(Sets::newHashSet, invokeinterface:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Iterable](Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::keySet, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
            invokeinterface:boolean(Set<Object>::addAll, var_3_6E:HashSet<Object>[expected:Set<Object>], invokeinterface:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Collection<?>](Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::keySet, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
            return:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(var_3_6E:HashSet<Object>)
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f[] \uc84e\u446c\u4f4a\uc910\u9a18\u416d() {
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
            return:\uc29a\u6198\u6bb9\u4492\u965f[](getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc238\uc31c\ua61f\u92ee\u51b2\u527a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u9033\u3711\u494c\u88c5\u69d9\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\ud523\u92ff\ubb2b\u759a\ud36e::\u9033\u3711\u494c\u88c5\u69d9\u97b7, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u9033\u3711\u494c\u88c5\u69d9\u97b7(int p0, int p1, int p2) {
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
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc7fe\u4975\u3bd6\u5bc4\u8cae\u839e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, boolean p2) {
        var_6_6C : int
        var_7_72 : int
        var_8_7B : int
        var_9_8C : \uc29a\u6198\u6bb9\u4492\u965f
        var_10_9B : boolean
        var_11_AC : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_12_B8 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_13_BF : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_14_12E : boolean
        var_15_22F : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_15_264 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
        var_6_6C = and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15))
        var_7_72 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        var_8_7B = and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15))
        var_9_8C = loadelement:\uc29a\u6198\u6bb9\u4492\u965f(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e), shr:int(var_7_72:int, and:int(ldc:int(16676), ldc:int(6804))))
        
        if (cmpeq:boolean(var_9_8C:\uc29a\u6198\u6bb9\u4492\u965f, getstatic:\uc29a\u6198\u6bb9\u4492\u965f(\ud523\u92ff\ubb2b\u759a\ud36e::\ua6bd\u8d90\ub8be\u71ae\u8413\ub8be))) {
            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])) {
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())
            }
            
            var_9_8C = initobject:\uc29a\u6198\u6bb9\u4492\u965f(\uc29a\u6198\u6bb9\u4492\u965f::<init>, shl:int(shr:int(var_7_72:int, and:int(ldc:int(18484), ldc:int(1285))), xor:int(ldc:int(171), ldc:int(175))))
            storeelement:\uc29a\u6198\u6bb9\u4492\u965f(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6c56\u88c5\ucfaf\uc3e3\u8308\ub171, this:\ud523\u92ff\ubb2b\u759a\ud36e), shr:int(var_7_72:int, and:int(ldc:int(6404), ldc:int(8356))), var_9_8C:\uc29a\u6198\u6bb9\u4492\u965f)
        }
        
        var_10_9B = invokevirtual:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\u647c\ud217\u8413\u6c56\ub70c\u3d4b, var_9_8C:\uc29a\u6198\u6bb9\u4492\u965f)
        var_11_AC = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc29a\u6198\u6bb9\u4492\u965f::\u3bd6\uc4d2\u183a\ubff1\u7e3f\u8258, var_9_8C:\uc29a\u6198\u6bb9\u4492\u965f, var_6_6C:int, and:int(var_7_72:int, ldc:int(15)), var_8_7B:int, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        
        if (cmpeq:boolean(var_11_AC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())
        }
        
        var_12_B8 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
        var_13_BF = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_11_AC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
        invokevirtual:boolean(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u6435\u7043\u120d\ud36e\ua068\u7330, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object](\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198))), var_6_6C:int, var_7_72:int, var_8_7B:int, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        invokevirtual:boolean(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u6435\u7043\u120d\ud36e\ua068\u7330, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object](\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u5f50\u51fa\u8753\u8350\u4cd9\u0b8e))), var_6_6C:int, var_7_72:int, var_8_7B:int, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        invokevirtual:boolean(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u6435\u7043\u120d\ud36e\ua068\u7330, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object](\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u8640\uae5d\ud12e\u8bb0\u12b2\u62da))), var_6_6C:int, var_7_72:int, var_8_7B:int, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        invokevirtual:boolean(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u6435\u7043\u120d\ud36e\ua068\u7330, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object](\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u47c2\u8308\u7330\u93a2\u5bc4\u839e))), var_6_6C:int, var_7_72:int, var_8_7B:int, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        var_14_12E = invokevirtual:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\u647c\ud217\u8413\u6c56\ub70c\u3d4b, var_9_8C:\uc29a\u6198\u6bb9\u4492\u965f)
        
        if (cmpne:boolean(var_10_9B:boolean, var_14_12E:boolean)) {
            invokevirtual:void(\u64f2\u6198\uc7fe\uae87\u4d85\uf995::\uf94d\u965f\u4cd9\u7049\u12cb\ub32d, invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833[expected:\u64f2\u6198\uc7fe\uae87\u4d85\uf995](\u34df\ua068\u72f1\u527a\u0b8e::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e))), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_14_12E:boolean)
        }
        
        if (getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e))) {
            if (cmpne:boolean(var_13_BF:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, var_12_B8:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_13_BF:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                    invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ucef1\u71ae\uc31c\uc29a\u4f52\u3e75, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                }
            }
        }
        else {
            invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ufe34\u51b2\u527a\uafe7\u4ab3\u4f4a, var_11_AC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:boolean)
        }
        
        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uc29a\u6198\u6bb9\u4492\u965f::\ud158\u4179\u8df4\u59ec\u64ab\u67d0, var_9_8C:\uc29a\u6198\u6bb9\u4492\u965f, var_6_6C:int, and:int(var_7_72:int, ldc:int(15)), var_8_7B:int), var_12_B8:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
            if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_13_BF:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                var_15_22F = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ube23\u3504\u759a\ub83f\u8753(\ube23\u3504\u759a\ub83f\u8753::\u4492\uc246\ucfaf\u64ab\uceb8\u3e75))
                
                if (cmpne:boolean(var_15_22F:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                    invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7af6\u12b2\ua562\u946b\u4c04\u64ab, var_15_22F:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                }
            }
            
            if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u385b\ufcaf\u4cd9\uc238\u647c\u873d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_11_AC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:boolean)
            }
            
            if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_12_B8:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                var_15_264 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ube23\u3504\u759a\ub83f\u8753(\ube23\u3504\u759a\ub83f\u8753::\u4492\uc246\ucfaf\u64ab\uceb8\u3e75))
                
                if (cmpne:boolean(var_15_264:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                    invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7af6\u12b2\ua562\u946b\u4c04\u64ab, var_15_264:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                }
                else {
                    invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4c04\u8709\u67e9\ucfaf\u36d3\u7d52, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79::\ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64, checkcast:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_12_B8:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a), getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
                }
            }
            
            putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u836c\u67d0\u4179\ud4fe\u67d0\u97b7, this:\ud523\u92ff\ubb2b\u759a\ud36e, xor:int[expected:boolean](ldc:int(5188), ldc:int(5189)))
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(var_11_AC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 \u624e\u1833\u416d\u64ab\u4c04\ub1b9() {
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
            return:\ube23\u51b2\u92ee\u6435\u8308\u1833(invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u34df\ua068\u72f1\u527a\u0b8e::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e))))
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_61 : int
        var_4_78 : int
        var_5_85 : int
        var_6_18C : int
        
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
        var_2_61 = and:int(ldc:int(1434231924), ldc:int(-25954492))
        putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u8c8a\u12cb\u494c\u6fb0\uc4d2\ud7e8, this:\ud523\u92ff\ubb2b\u759a\ud36e, and:int[expected:boolean](ldc:int(13251), ldc:int(37)))
        var_4_78 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
        var_5_85 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
        
        if (cmpeq:boolean(var_4_78:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
            if (cmpeq:boolean(var_5_85:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                goto(Label_0250)
            }
        }
        
        Label_0147:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(66007566))
        }
        else {
            var_2_61 = and:int(var_2_61:int, ldc:int(-558631474))
            invokeinterface:void(Logger::warn, getstatic:Logger(\ud523\u92ff\ubb2b\u759a\ud36e::\u4492\uc84e\ubf56\u9033\u9033\u9af2), loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), and:int(ldc:int(16397), ldc:int(2101))), invokestatic:Integer[expected:Object](Integer::valueOf, var_4_78:int), invokestatic:Integer(Integer::valueOf, var_5_85:int), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e))), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
            putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, p0:\u7d52\u718f\u3776\u6fb0\ub83f, and:int[expected:boolean](ldc:int(1105), ldc:int(4263)))
        }
        
        Label_0250:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_6_18C = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
            
            if (cmplt:boolean(var_6_18C:int, ldc:int(0))) {
                var_6_18C = and:int(ldc:int(14657), ldc:int(-15700))
            }
            
            if (cmpge:boolean(var_6_18C:int, arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                var_6_18C = sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), and:int(ldc:int(65), ldc:int(3235)))
            }
            
            putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f, xor:int[expected:boolean](ldc:int(8704), ldc:int(8705)))
            putfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
            putfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u7af6\ua068\u7873\u71f1\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f, var_6_18C:int)
            putfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
            invokevirtual:boolean(\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>::add, loadelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_6_18C:int), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0147)
    }
    
    public void \u4f4a\u8d90\u8753\u59ec\u56bd\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, long[] p1) {
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
            invokevirtual:void(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u8258\u1187\u3d4b\u6cfe\u76bc\u120d, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object])), p1:long[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8413\u759a\ub19c\ubb2b\ubcb0\u6bb9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3e75\u76bc\u6fb0\u5d20\uc3e3\uae87, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u7af6\ua068\u7873\u71f1\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\u76bc\u6fb0\u5d20\uc3e3\uae87(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, int p1) {
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
            
            if (cmplt:boolean(p1:int, ldc:int(0))) {
                p1 = and:int(ldc:int(-20195), ldc:int(19042))
            }
            
            if (cmpge:boolean(p1:int, arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                p1 = sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), xor:int(ldc:int(18), ldc:int(19)))
            }
            
            invokevirtual:boolean(\u9255\ubf56\u4d85\u873d\u3711\u6198<T>::remove, loadelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e), p1:int), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8258\u7af6\ubb2b\u6198\u6fb0\u9a18(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, int p1, int p2) {
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
            return:int(sub:int(invokevirtual:int(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u4daf\u4daf\ud217\ud523\u4179\u8350, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object])), and:int(p1:int, ldc:int(15)), and:int(p2:int, ldc:int(15))), xor:int(ldc:int(2104), ldc:int(2105))))
        }
        
        goto(Label_0006)
    }
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc3e3\u7006\uc2e8\u62da\uc246\u600f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_5_6E : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        
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
            var_5_6E = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(ternaryop:\ub83f\uc9f6\u47c2\u67d0\u7ce1(invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, var_5_6E:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f]), invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79::\ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64, checkcast:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_5_6E:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a), getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e)), aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ube23\u3504\u759a\ub83f\u8753(\ube23\u3504\u759a\ub83f\u8753::\u4492\uc246\ucfaf\u64ab\uceb8\u3e75)))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ube23\u3504\u759a\ub83f\u8753 p1) {
        var_3_9F : int
        var_5_6F : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_6_C2 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_D7 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
            var_3_9F = and:int(ldc:int(-1750393229), ldc:int(-1008091396))
            var_5_6F = checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))
            
            if (cmpeq:boolean(var_5_6F:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                var_6_C2 = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::remove, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))
                
                if (cmpne:boolean(var_6_C2:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                    var_7_D7 = invokespecial:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\u1833\ub7dc\u0c95\u64f2\ubb2b\uf995, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_6_C2:\uc31c\uc87f\uc246\u3776\ub7dc)
                    
                    if (cmpne:boolean(var_7_D7:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                        return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_7_D7:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                    }
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_9F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_9F = and:int(var_3_9F:int, ldc:int(-1812652326))
                    
                    if (cmpeq:boolean(var_5_6F:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                        if (cmpne:boolean(p1:\ube23\u3504\u759a\ub83f\u8753, getstatic:\ube23\u3504\u759a\ub83f\u8753(\ube23\u3504\u759a\ub83f\u8753::\u8308\u5db4\u92ee\u8413\u156b\u34df))) {
                            looporswitchbreak()
                        }
                        
                        var_5_6F = invokespecial:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc3e3\u7006\uc2e8\u62da\uc246\u600f, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4c04\u8709\u67e9\ucfaf\u36d3\u7d52, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_5_6F:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_9F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_9F = and:int(var_3_9F:int, ldc:int(1287223554))
                }
                else {
                    var_3_9F = and:int(var_3_9F:int, ldc:int(-167807247))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u47c2\uc87f\u6b5f\ud523\u52d3\u7d52, var_5_6F:\ub83f\uc9f6\u47c2\u67d0\u7ce1))) {
                        looporswitchbreak()
                    }
                    
                    invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::remove, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
                    return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())
                }
            }
            
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_5_6F:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(-946616086), ldc:int(-942483205))
            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u8753\u647c\u6bb9\u7873\u759a\u69d9, this:\ud523\u92ff\ubb2b\u759a\ud36e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1), p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
            
            if (logicalor:boolean(getfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u64ab\uc29a\u1833\uc4d2\u8d98\uc2bd, this:\ud523\u92ff\ubb2b\u759a\ud36e), invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(531955198))
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4c04\u8709\u67e9\ucfaf\u36d3\u7d52, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1), p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p1) {
        var_5_99 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
            
            if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))) {
                invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ub70c\u8d98\ubf56\u6b5f\u72f1\u4c2b, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u946b\u4492\uc29a\u9937\uc87f\u9255, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                var_5_99 = checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::put, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1))
                
                if (cmpne:boolean(var_5_99:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                    if (cmpne:boolean(var_5_99:\ub83f\uc9f6\u47c2\u67d0\u7ce1, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1)) {
                        invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_5_99:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::put, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), and:int(ldc:int(14), ldc:int(14982)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), xor:int(ldc:int(25603), ldc:int(25604)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), and:int(ldc:int(16472), ldc:int(10507))))), p0:\uc31c\uc87f\uc246\u3776\ub7dc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ubefe\u4e72\u6d99\uf995\u759a\uc84e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_67 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_5_B0 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_5_81 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
        var_4_67 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (logicaland:boolean(cmpne:boolean(var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()), logicalnot:boolean(invokevirtual:boolean(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u47c2\uc87f\u6b5f\ud523\u52d3\u7d52, var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1)))) {
            var_5_B0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7e3f\uc229\u34df\u61a4\ud7e8\u6b0d, var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, var_5_B0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), xor:int(ldc:int(-24051), ldc:int(-24060))), and:int[expected:boolean](ldc:int(-26220), ldc:int(26219)))
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_B0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        var_5_81 = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))
        
        if (cmpne:boolean(var_5_81:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
            var_5_81 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, var_5_81:\uc31c\uc87f\uc246\u3776\ub7dc)
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, var_5_81:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), xor:int(ldc:int(156), ldc:int(149))), xor:int[expected:boolean](ldc:int(4448), ldc:int(4449)))
        }
        
        return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_81:\uc31c\uc87f\uc246\u3776\ub7dc)
    }
    
    public void \ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_7C : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
            var_2_61 = and:int(ldc:int(-942686724), ldc:int(1736301532))
            
            if (logicalor:boolean(getfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u64ab\uc29a\u1833\uc4d2\u8d98\uc2bd, this:\ud523\u92ff\ubb2b\u759a\ud36e), invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-8609865))
                var_4_7C = checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::remove, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))
                
                if (cmpne:boolean(var_4_7C:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                    invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_4_7C:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u40a9\u120d\u5f50\u718f\u1187\u516c() {
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
            
            if (cmpne:boolean(getfield:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>(\ud523\u92ff\ubb2b\u759a\ud36e::\u6b5f\u59ec\u3c25\u7330\u494c\u4179, this:\ud523\u92ff\ubb2b\u759a\ud36e), aconstnull:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>())) {
                invokeinterface:void(Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>::accept, getfield:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>(\ud523\u92ff\ubb2b\u759a\ud36e::\u6b5f\u59ec\u3c25\u7330\u494c\u4179, this:\ud523\u92ff\ubb2b\u759a\ud36e), this:\ud523\u92ff\ubb2b\u759a\ud36e)
                putfield:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>(\ud523\u92ff\ubb2b\u759a\ud36e::\u6b5f\u59ec\u3c25\u7330\u494c\u4179, this:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\uf94d\u8640\u5bc4\ufcaf\u8350() {
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
            putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u836c\u67d0\u4179\ud4fe\u67d0\u97b7, this:\ud523\u92ff\ubb2b\u759a\ud36e, and:int[expected:boolean](ldc:int(16835), ldc:int(1065)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub70c\u3a62\ucef1\u965f\u0c95\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p2, java.util.function.Predicate<? super \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p3) {
        var_5_63 : int
        var_7_74 : int
        var_8_85 : int
        var_7_A0 : int
        var_8_BB : int
        var_9_BF : int
        var_11_EB : List<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_12_F4 : int
        var_13_FD : int
        var_14_11C : \u7d52\u718f\u3776\u6fb0\ub83f
        var_15_180 : \ub171\u0800\u071d\ubb2b\u9937[]
        var_16_185 : int
        var_17_18E : int
        var_18_1A3 : \ub171\u0800\u071d\ubb2b\u9937
        
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
            var_5_63 = and:int(ldc:int(2113958255), ldc:int(2141910013))
            var_7_74 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_85 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_7_A0 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, var_7_74:int, and:int(ldc:int(-27213), ldc:int(27200)), sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), xor:int(ldc:int(533), ldc:int(532))))
            var_8_BB = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, var_8_85:int, and:int(ldc:int(17674), ldc:int(-17675)), sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), xor:int(ldc:int(19457), ldc:int(19456))))
            var_9_BF = var_7_A0:int
            
            loop {
                var_5_63 = and:int(var_5_63:int, ldc:int(-1173635587))
                
                if (cmpgt:boolean(var_9_BF:int, var_8_BB:int)) {
                    looporswitchbreak()
                }
                
                var_11_EB = invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>::\ua3b4\u494c\ucfaf\u34df\u839e\u965f, loadelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_9_BF:int))
                var_12_F4 = invokeinterface:int(List<E>::size, var_11_EB:List<\u7d52\u718f\u3776\u6fb0\ub83f>)
                var_13_FD = and:int(ldc:int(27142), ldc:int(-27191))
                
                while (cmplt:boolean(var_13_FD:int, var_12_F4:int)) {
                    var_14_11C = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(List<\u7d52\u718f\u3776\u6fb0\ub83f>::get, var_11_EB:List<\u7d52\u718f\u3776\u6fb0\ub83f>, var_13_FD:int))
                    
                    if (invokevirtual:boolean(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ud171\uc7fe\u67d0\u61a4\u946b\u8640, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, var_14_11C:\u7d52\u718f\u3776\u6fb0\ub83f), p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)) {
                        if (cmpne:boolean(var_14_11C:\u7d52\u718f\u3776\u6fb0\ub83f, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            if (logicalor:boolean(cmpeq:boolean(p3:Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>, aconstnull:Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>()), invokeinterface:boolean(Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>::test, p3:Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>, var_14_11C:\ua3b4\u9a18\ufcaf\ubff1\u3c25))) {
                                invokeinterface:boolean(List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>::add, p2:List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>, var_14_11C:\ua3b4\u9a18\ufcaf\ubff1\u3c25)
                            }
                            
                            if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, var_14_11C:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                var_15_180 = invokevirtual:\ub171\u0800\u071d\ubb2b\u9937[](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u0b8e\ud36e\u7049\uc7fe\uc2bd\u8d98, checkcast:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, var_14_11C:\ua3b4\u9a18\ufcaf\ubff1\u3c25))
                                var_16_185 = arraylength:int(var_15_180:\ub171\u0800\u071d\ubb2b\u9937[])
                                var_17_18E = and:int(ldc:int(13641), ldc:int(-13642))
                                
                                while (cmplt:boolean(var_17_18E:int, var_16_185:int)) {
                                    var_18_1A3 = loadelement:\ub171\u0800\u071d\ubb2b\u9937(var_15_180:\ub171\u0800\u071d\ubb2b\u9937[], var_17_18E:int)
                                    
                                    if (cmpne:boolean(var_18_1A3:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                                        if (invokevirtual:boolean(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ud171\uc7fe\u67d0\u61a4\u946b\u8640, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, var_18_1A3:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)) {
                                            if (logicalor:boolean(cmpeq:boolean(p3:Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>, aconstnull:Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>()), invokeinterface:boolean(Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>::test, p3:Predicate<\ua3b4\u9a18\ufcaf\ubff1\u3c25>, var_18_1A3:\ua3b4\u9a18\ufcaf\ubff1\u3c25))) {
                                                invokeinterface:boolean(List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>::add, p2:List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>, var_18_1A3:\ua3b4\u9a18\ufcaf\ubff1\u3c25)
                                            }
                                        }
                                    }
                                    
                                    inc:int(var_17_18E, ldc:int(1))
                                }
                            }
                        }
                    }
                    
                    inc:int(var_13_FD, ldc:int(1))
                }
                
                inc:int(var_9_BF, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\uc87f\ubb2b\u4c2b\u34df\u1187(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.List<? super T> p2, java.util.function.Predicate<? super T> p3) {
        var_5_14E : int
        var_7_74 : int
        var_8_85 : int
        var_7_A0 : int
        var_8_BB : int
        var_9_BF : int
        var_10_100 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_11_142 : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_5_14E = and:int(ldc:int(-1421429190), ldc:int(-680534377))
            var_7_74 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_85 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_7_A0 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, var_7_74:int, and:int(ldc:int(-8372), ldc:int(8371)), sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), and:int(ldc:int(27), ldc:int(29185))))
            var_8_BB = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, var_8_85:int, and:int(ldc:int(-1123), ldc:int(1122)), sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), and:int(ldc:int(1301), ldc:int(2185))))
            var_9_BF = var_7_A0:int
            
            loop {
                if (cmpne:boolean(and:int(var_5_14E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_14E = and:int(var_5_14E:int, ldc:int(-219220073))
                    
                    if (cmple:boolean(var_9_BF:int, var_8_BB:int)) {
                        var_10_100 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(Collection<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokevirtual:Collection<\u7d52\u718f\u3776\u6fb0\ub83f>(\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>::\u3776\u071d\ud36e\u6cfe\u6fb0\u960f, loadelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_9_BF:int), ldc:Class<\u7d52\u718f\u3776\u6fb0\ub83f>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class)))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_5_14E:int, ldc:int(33554432)), ldc:int(0))) {
                                var_5_14E = and:int(var_5_14E:int, ldc:int(-1427112138))
                                
                                if (invokeinterface:boolean(Iterator::hasNext, var_10_100:Iterator)) {
                                    var_11_142 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_10_100:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                                    
                                    if (logicalor:boolean(cmpeq:boolean(p0:\u9255\u0c95\u4cd9\ube23\u760c<?>, aconstnull:\u9255\u0c95\u4cd9\ube23\u760c<?>()), cmpeq:boolean(invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, var_11_142:\u7d52\u718f\u3776\u6fb0\ub83f), p0:\u9255\u0c95\u4cd9\ube23\u760c<?>))) {
                                        var_5_14E = and:int(var_5_14E:int, ldc:int(-1278224838))
                                        
                                        if (invokevirtual:boolean(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ud171\uc7fe\u67d0\u61a4\u946b\u8640, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, var_11_142:\u7d52\u718f\u3776\u6fb0\ub83f), p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)) {
                                            if (invokeinterface:boolean(Predicate<? super T>::test, p3:Predicate<? super T>, var_11_142:Object[expected:? super T])) {
                                                invokeinterface:boolean(List<? super T>::add, p2:List<? super T>, var_11_142:Object[expected:? super T])
                                            }
                                        }
                                    }
                                    
                                    var_5_14E = and:int(var_5_14E:int, ldc:int(-1219510342))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_14E:int, ldc:int(2048)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_5_14E = and:int(var_5_14E:int, ldc:int(-614009130))
                        inc:int(var_9_BF, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_14E:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u516c\u92ff\u927d\u8bb0\u4c2b\u0b8e(java.lang.Class<? extends T> p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.List<T> p2, java.util.function.Predicate<? super T> p3) {
        var_5_174 : int
        var_7_74 : int
        var_8_85 : int
        var_7_A0 : int
        var_8_BB : int
        var_9_BF : int
        var_10_10A : Iterator<T>
        var_11_14C : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_5_174 = and:int(ldc:int(1371588864), ldc:int(-846090878))
            var_7_74 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_8_85 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)), ldc:double(16.0)))
            var_7_A0 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, var_7_74:int, and:int(ldc:int(17224), ldc:int(-18249)), sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), and:int(ldc:int(16665), ldc:int(131))))
            var_8_BB = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, var_8_85:int, and:int(ldc:int(18209), ldc:int(-18286)), sub:int(arraylength:int(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e)), xor:int(ldc:int(18512), ldc:int(18513))))
            var_9_BF = var_7_A0:int
            
            loop {
                if (cmpeq:boolean(and:int(var_5_174:int, ldc:int(262144)), ldc:int(0))) {
                    var_5_174 = and:int(var_5_174:int, ldc:int(1006234586))
                    
                    if (cmple:boolean(var_9_BF:int, var_8_BB:int)) {
                        var_10_10A = invokeinterface:Iterator<T>(Collection<T>::iterator, invokevirtual:Collection<T>(\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>::\u3776\u071d\ud36e\u6cfe\u6fb0\u960f, loadelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_9_BF:int), p0:Class<T>))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_5_174:int, ldc:int(16)), ldc:int(0))) {
                                var_5_174 = and:int(var_5_174:int, ldc:int(-2014777999))
                                
                                if (invokeinterface:boolean(Iterator::hasNext, var_10_10A:Iterator)) {
                                    var_11_14C = checkcast:T extends \u7d52\u718f\u3776\u6fb0\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](T extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:T extends \u7d52\u718f\u3776\u6fb0\ub83f(Iterator<T>::next, var_10_10A:Iterator<T>))
                                    
                                    if (invokevirtual:boolean(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ud171\uc7fe\u67d0\u61a4\u946b\u8640, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, var_11_14C:\u7d52\u718f\u3776\u6fb0\ub83f), p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)) {
                                        if (logicalor:boolean(cmpeq:boolean(p3:Predicate<T>, aconstnull:Predicate<T>()), invokeinterface:boolean(Predicate<T>::test, p3:Predicate<T>, var_11_14C:T extends \u7d52\u718f\u3776\u6fb0\ub83f))) {
                                            var_5_174 = and:int(var_5_174:int, ldc:int(-707260546))
                                            invokeinterface:boolean(List<T>::add, p2:List<T>, var_11_14C:T extends \u7d52\u718f\u3776\u6fb0\ub83f)
                                        }
                                    }
                                    
                                    var_5_174 = and:int(var_5_174:int, ldc:int(129526668))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_174:int, ldc:int(8)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_5_174 = and:int(var_5_174:int, ldc:int(1067744517))
                        inc:int(var_9_BF, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_174:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_174 = and:int(var_5_174:int, ldc:int(1961276774))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ufe34\u8350\ua6bd\ubded\ub8be\uae5d() {
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
            return:boolean(and:int[expected:boolean](ldc:int(-1662), ldc:int(1589)))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c \u4f52\u4daf\uc910\ud217\uc3e3\u8d98() {
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
            return:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \u983f\uc3e3\u5bc4\ua562\u3d4b\u5654(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p2, int p3) {
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
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 \u8c8a\u4179\u416d\u64f2\u2dcc\u3776() {
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
            return:\u8df4\u446c\u6d69\u5fe1\u64f2(getfield:\u8df4\u446c\u6d69\u5fe1\u64f2(\ud523\u92ff\ubb2b\u759a\ud36e::\u98a4\u516c\ud4fe\u392e\u3bd6\u4e72, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \u494c\ubefe\u9937\ufcaf\u34df\ua068(boolean p0) {
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
            putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u64ab\uc29a\u1833\uc4d2\u8d98\uc2bd, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c \u8258\u4d85\u6b5f\u3bc9\u93a2\ud7e8() {
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
            return:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.util.Map.Entry<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52>> \uc7fe\u1187\u7c6b\u759a\uc9f6\u3d64() {
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
            return:Collection<Entry<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>>(invokestatic:Set<Object>[expected:Collection<Entry<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>>](Collections::unmodifiableSet, invokeinterface:Set<Entry<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>>(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::entrySet, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\ud523\u92ff\ubb2b\u759a\ud36e::\ubff1\u4bc8\u97b7\u183a\u600f\u3a62, this:\ud523\u92ff\ubb2b\u759a\ud36e))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1> \u69d9\u62da\ubb2b\ua6bd\u99f7\u99f7() {
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
            return:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\u9af2\u5bc4\u5fe1\u6435\u9a18, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u9255\ubf56\u4d85\u873d\u3711\u6198<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f>[] \u6cfe\u7af6\u3bc9\u6c52\u183a\u760c() {
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
            return:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](getfield:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u8bb0\ubb2b\u36d3\u3776\u7049\ua61f, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uc31c\uc87f\uc246\u3776\ub7dc(checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u6c56\u5db4\u9937\u3bc9\u647c\ufcaf() {
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
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> \u34df\u983f\u647c\ufcaf\ub102\u3e2a() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(getfield:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud523\u92ff\ubb2b\u759a\ud36e::\u51fa\ub171\u385b\u97b7\u3a62\u7c6b, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> \uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(getfield:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ud523\u92ff\ubb2b\u759a\ud36e::\u51b2\uc4d2\u4daf\u4ab3\uc4d2\u7873, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \u3711\u839e\u3a62\ubff1\ub102\u7e3f(boolean p0) {
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
            putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u836c\u67d0\u4179\ud4fe\u67d0\u97b7, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u446c\uc7fe\u5d20\ube23\u4bc8\ud51e() {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(logicalnot:boolean(getfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u836c\u67d0\u4179\ud4fe\u67d0\u97b7, this:\ud523\u92ff\ubb2b\u759a\ud36e)), logicalor:boolean(logicalnot:boolean(getfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u8c8a\u12cb\u494c\u6fb0\uc4d2\ud7e8, this:\ud523\u92ff\ubb2b\u759a\ud36e)), cmpeq:boolean(invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e)), getfield:long(\ud523\u92ff\ubb2b\u759a\ud36e::\u7043\u5db4\u927d\u16f6\u97e6\u51b2, this:\ud523\u92ff\ubb2b\u759a\ud36e)))), and:int(ldc:int(-26285), ldc:int(9772)), xor:int(ldc:int(4481), ldc:int(4480))))
        }
        
        goto(Label_0006)
    }
    
    public void \u5654\u4f52\u4c2b\u7c6b\uc29a\u52d3(boolean p0) {
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
            putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u8c8a\u12cb\u494c\u6fb0\uc4d2\ud7e8, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\ud171\u7bad\u3776\u36d3\ub83f(long p0) {
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
            putfield:long(\ud523\u92ff\ubb2b\u759a\ud36e::\u7043\u5db4\u927d\u16f6\u97e6\u51b2, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?> \u64ab\u7af6\u8c8a\u9937\u40a9\u4bc8(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0) {
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
            return:\u34df\uceb8\u34df\u8640\u1187<?>(checkcast:\u34df\uceb8\u34df\u8640\u1187<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>.class, invokeinterface:\u34df\uceb8\u34df\u8640\u1187<?>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::get, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\ud523\u92ff\ubb2b\u759a\ud36e::\ub171\u8308\u8753\u71ae\u5d20\ucfaf, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u5654\u9937\u72f1\ud4fe\u0c95<?>[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\u67e9\uc246\ubcb0\u6cfe\u3d4b(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?> p1) {
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
            invokeinterface:\u34df\uceb8\u34df\u8640\u1187<?>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::put, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\ud523\u92ff\ubb2b\u759a\ud36e::\ub171\u8308\u8753\u71ae\u5d20\ucfaf, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u5654\u9937\u72f1\ud4fe\u0c95<?>, p1:\u34df\uceb8\u34df\u8640\u1187<?>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> \u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1() {
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
            return:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\ud523\u92ff\ubb2b\u759a\ud36e::\ub171\u8308\u8753\u71ae\u5d20\ucfaf, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\u69d9\u600f\uc87f\u40a9\ub6ab(java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> p0) {
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
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\ud523\u92ff\ubb2b\u759a\ud36e::\ub171\u8308\u8753\u71ae\u5d20\ucfaf, this:\ud523\u92ff\ubb2b\u759a\ud36e))
            invokeinterface:void(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::putAll, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\ud523\u92ff\ubb2b\u759a\ud36e::\ub171\u8308\u8753\u71ae\u5d20\ucfaf, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.longs.LongSet \u9255\ub8be\u4c04\u6fb0\ub18d\u6b5f(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0) {
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
    
    public void \u4c2b\ua6bd\u7330\u839e\uae5d\u69d9(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0, long p1) {
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
    
    public java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet> \ua3b4\u6ec6\u62da\u71ae\u7ce1\u5140() {
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
            return:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\ud523\u92ff\ubb2b\u759a\ud36e::\uc7fe\ub102\u72f1\u7049\u416d\u647c, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \ufe34\u9af2\u67d0\u8cae\ub113\uf995(java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet> p0) {
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
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\ud523\u92ff\ubb2b\u759a\ud36e::\uc7fe\ub102\u72f1\u7049\u416d\u647c, this:\ud523\u92ff\ubb2b\u759a\ud36e))
            invokeinterface:void(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>::putAll, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\ud523\u92ff\ubb2b\u759a\ud36e::\uc7fe\ub102\u72f1\u7049\u416d\u647c, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public long \uc229\ubb2b\u62da\uc29a\u8753\u9255() {
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
            return:long(getfield:long(\ud523\u92ff\ubb2b\u759a\ud36e::\u7d52\u5245\ud51e\ub70c\u6c56\u67d0, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975(long p0) {
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
            putfield:long(\ud523\u92ff\ubb2b\u759a\ud36e::\u7d52\u5245\ud51e\ub70c\u6c56\u67d0, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\ufcaf\ub171\u3a62\ucef1\ud523() {
        var_1_134 : int
        var_3_66 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_4_6E : int
        var_5_125 : ShortListIterator
        var_7_180 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_4_D4 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        
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
            var_1_134 = and:int(ldc:int(-15246229), ldc:int(1673393915))
            var_3_66 = invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\ud523\u92ff\ubb2b\u759a\ud36e)
            var_4_6E = and:int(ldc:int(-28321), ldc:int(27680))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(32)), ldc:int(0))) {
                    var_1_134 = and:int(var_1_134:int, ldc:int(-1957994603))
                    goto(Label_0231)
                }
                
                if (cmpne:boolean(and:int(var_1_134:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_134 = and:int(var_1_134:int, ldc:int(-774376219))
                    
                    if (cmplt:boolean(var_4_6E:int, arraylength:int(getfield:ShortList[](\ud523\u92ff\ubb2b\u759a\ud36e::\u927d\u7ce1\u927d\uc7fe\u7006\u4c2b, this:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                        if (cmpeq:boolean(loadelement:ShortList(getfield:ShortList[](\ud523\u92ff\ubb2b\u759a\ud36e::\u927d\u7ce1\u927d\uc7fe\u7006\u4c2b, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_4_6E:int), aconstnull:ShortList())) {
                            goto(Label_0231)
                        }
                        
                        var_5_125 = invokeinterface:ShortListIterator(ShortList::iterator, loadelement:ShortList(getfield:ShortList[](\ud523\u92ff\ubb2b\u759a\ud36e::\u927d\u7ce1\u927d\uc7fe\u7006\u4c2b, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_4_6E:int))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(4)), ldc:int(0))) {
                                var_1_134 = and:int(var_1_134:int, ldc:int(1534981227))
                                
                                if (invokeinterface:boolean(Iterator::hasNext, var_5_125:Iterator)) {
                                    var_7_180 = invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u647c\u72f1\u1833\u6bb9\u7049::\ubf56\u12cb\u71ae\u873d\u7043\u6c52, invokevirtual:short(Short::shortValue, checkcast:Short(java.lang.Short.class, invokeinterface:Short(Iterator<Short>::next, var_5_125:Iterator<Short>))), var_4_6E:int, var_3_66:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
                                    invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_7_180:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\ube23\uc9f6\u12cb\ua61f\u12b2\u6cfe, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ud523\u92ff\ubb2b\u759a\ud36e, var_7_180:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_7_180:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:int(20))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(128)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_134 = and:int(var_1_134:int, ldc:int(-1211578135))
                        }
                        
                        var_1_134 = and:int(var_1_134:int, ldc:int(1742566625))
                        invokeinterface:void(ShortList::clear, loadelement:ShortList(getfield:ShortList[](\ud523\u92ff\ubb2b\u759a\ud36e::\u927d\u7ce1\u927d\uc7fe\u7006\u4c2b, this:\ud523\u92ff\ubb2b\u759a\ud36e), var_4_6E:int))
                        goto(Label_0231)
                    }
                }
                
                Label_0153:
                
                if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_134 = and:int(var_1_134:int, ldc:int(868712063))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_134:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_134 = and:int(var_1_134:int, ldc:int(-1995889430))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0231:
                
                if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(1)), ldc:int(0))) {
                    var_1_134 = and:int(var_1_134:int, ldc:int(306686120))
                    goto(Label_0153)
                }
                
                if (cmpeq:boolean(and:int(var_1_134:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_134 = and:int(var_1_134:int, ldc:int(96247777))
                }
                else {
                    var_1_134 = and:int(var_1_134:int, ldc:int(-1054868357))
                    inc:int(var_4_6E, ldc:int(1))
                }
            }
            
            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u4d85\u516c\u7043\u64ab\u4c04\u6b0d, this:\ud523\u92ff\ubb2b\u759a\ud36e)
            var_4_D4 = invokevirtual:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokestatic:HashSet(Sets::newHashSet, invokeinterface:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Iterable](Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::keySet, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e))))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_D4:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ud523\u92ff\ubb2b\u759a\ud36e::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\ud523\u92ff\ubb2b\u759a\ud36e, checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_4_D4:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)))
            }
            
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\ud523\u92ff\ubb2b\u759a\ud36e::\u97e6\u98a4\u8350\u92ff\u51fa\u7049, this:\ud523\u92ff\ubb2b\u759a\ud36e))
            invokevirtual:void(\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa::\u839e\u51b2\u3bd6\uc2bd\uafe7\uc910, getfield:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(\ud523\u92ff\ubb2b\u759a\ud36e::\u5fe1\uc2bd\uae5d\u12cb\uc2bd\u4975, this:\ud523\u92ff\ubb2b\u759a\ud36e), this:\ud523\u92ff\ubb2b\u759a\ud36e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \u1833\ub7dc\u0c95\u64f2\ubb2b\uf995(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
        var_5_67 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_6_95 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_7_A3 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        
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
            var_5_67 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), xor:int(ldc:int(524), ldc:int(518))), invokevirtual:String[expected:Object](\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), xor:int(ldc:int(525), ldc:int(518))))))) {
                var_6_95 = invokestatic:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u3504\u64f2\ub171\u873d\u76bc\ufcaf, var_5_67:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\uc31c\uc87f\uc246\u3776\ub7dc)
            }
            else {
                var_7_A3 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_5_67:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
                
                if (logicalnot:boolean(instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_7_A3:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a))) {
                    var_6_95 = aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()
                    invokeinterface:void(Logger::warn, getstatic:Logger(\ud523\u92ff\ubb2b\u759a\ud36e::\u4492\uc84e\ubf56\u9033\u9033\u9af2), loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), and:int(ldc:int(26638), ldc:int(4956))), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object], var_5_67:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object])
                }
                else {
                    var_6_95 = invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79::\ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64, checkcast:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_7_A3:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79]), getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e))
                }
            }
            
            if (cmpeq:boolean(var_6_95:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\ud523\u92ff\ubb2b\u759a\ud36e::\u4492\uc84e\ubf56\u9033\u9033\u9af2), loadelement:String(getstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b), xor:int(ldc:int(6149), ldc:int(6152))), var_5_67:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            }
            else {
                invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ub70c\u8d98\ubf56\u6b5f\u72f1\u4c2b, var_6_95:\ub83f\uc9f6\u47c2\u67d0\u7ce1, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud523\u92ff\ubb2b\u759a\ud36e::\u61a4\u5db4\ucef1\u9a18\u52d3\u8df4, this:\ud523\u92ff\ubb2b\u759a\ud36e), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u8753\u647c\u6bb9\u7873\u759a\u69d9, this:\ud523\u92ff\ubb2b\u759a\ud36e, var_6_95:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
            }
            
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_6_95:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa \u183a\u7af6\u36d3\uc9f6\u6bb9\u5245() {
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
            return:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(getfield:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(\ud523\u92ff\ubb2b\u759a\ud36e::\u5fe1\uc2bd\uae5d\u12cb\uc2bd\u4975, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.shorts.ShortList[] \u12b2\u8df4\u156b\uc9f6\u51fa\u97e6() {
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
            return:ShortList[](getfield:ShortList[](\ud523\u92ff\ubb2b\u759a\ud36e::\u927d\u7ce1\u927d\uc7fe\u7006\u4c2b, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \u4d85\u516c\u7043\u64ab\u4c04\u6b0d() {
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
    
    public void \ub8be\u8308\u74b1\ubb2b\u7006\u3d4b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
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
            
            if (cmpeq:boolean(getfield:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:Object](\ud523\u92ff\ubb2b\u759a\ud36e::\u51fa\ub171\u385b\u97b7\u3a62\u7c6b, this:\ud523\u92ff\ubb2b\u759a\ud36e), invokestatic:\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>[expected:Object](\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>::\u071d\u385b\u7049\uae5d\uc84e\u1833))) {
                putfield:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud523\u92ff\ubb2b\u759a\ud36e::\u51fa\ub171\u385b\u97b7\u3a62\u7c6b, this:\ud523\u92ff\ubb2b\u759a\ud36e, initobject:\u8753\u97e6\u5bc4\u6bb9\u62da<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u8753\u97e6\u5bc4\u6bb9\u62da<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::<init>, invokedynamic:Function<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(apply:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\u4ab3\ub83f\u718f\ucb79\u120d/\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa;)Ljava/util/function/Function;, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255)), invokevirtual:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u4975\u5f50\ud51e\ucef1\ub6ab\uf94d, invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\uff55\ub8be\u385b\u92ee\u7330, p0:\ube23\uc238\u5140\u4cd9\u8aa5), getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e), xor:int[expected:boolean](ldc:int(13314), ldc:int(13315)), and:int[expected:boolean](ldc:int(-12579), ldc:int(12578))), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, this:\ud523\u92ff\ubb2b\u759a\ud36e, xor:int[expected:boolean](ldc:int(17456), ldc:int(17457)))
            }
            
            if (cmpeq:boolean(getfield:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:Object](\ud523\u92ff\ubb2b\u759a\ud36e::\u51b2\uc4d2\u4daf\u4ab3\uc4d2\u7873, this:\ud523\u92ff\ubb2b\u759a\ud36e), invokestatic:\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>[expected:Object](\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>::\u071d\u385b\u7049\uae5d\uc84e\u1833))) {
                putfield:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ud523\u92ff\ubb2b\u759a\ud36e::\u51b2\uc4d2\u4daf\u4ab3\uc4d2\u7873, this:\ud523\u92ff\ubb2b\u759a\ud36e, initobject:\u8753\u97e6\u5bc4\u6bb9\u62da<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u8753\u97e6\u5bc4\u6bb9\u62da<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>::<init>, invokedynamic:Function<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(apply:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\u4ab3\ub83f\u718f\ucb79\u120d/\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa;)Ljava/util/function/Function;, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5245\u8d98\ucb79\u6d99\u64ab)), invokevirtual:List<\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>>(\u4f4a\u92ff\u5bc4\u3776\u4c04<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>::\u4975\u5f50\ud51e\ucef1\ub6ab\uf94d, invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8cae\u4f4a\ud217\u8709\u4cd9\ud51e, p0:\ube23\uc238\u5140\u4cd9\u8aa5), getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u9af2\u51fa\u4e72\ud217\u62da\uc9f6, this:\ud523\u92ff\ubb2b\u759a\ud36e), xor:boolean(ldc:boolean(0), ldc:boolean(1)), and:int[expected:boolean](ldc:int(-30903), ldc:int(22710))), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])))
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, this:\ud523\u92ff\ubb2b\u759a\ud36e, xor:int[expected:boolean](ldc:int(6416), ldc:int(6417)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \u8753\ud523\u6cfe\u0c95\u946b\u385b() {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uf9c5\u5140\ud158\u4492\u3dd3 \uf9c5\uc7fe\u960f\u6b0d\u5f50\ube23() {
        var_1_61 : int
        stack_8B_0 : \uf9c5\u5140\ud158\u4492\u3dd3 [generated]
        
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
            var_1_61 = and:int(ldc:int(1989921963), ldc:int(913818611))
            
            if (cmpne:boolean(getfield:Supplier<\uf9c5\u5140\ud158\u4492\u3dd3>(\ud523\u92ff\ubb2b\u759a\ud36e::\uf995\u392e\u71ae\u718f\ud171\u71f1, this:\ud523\u92ff\ubb2b\u759a\ud36e), aconstnull:Supplier<\uf9c5\u5140\ud158\u4492\u3dd3>())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-151808591))
                stack_8B_0 = checkcast:\uf9c5\u5140\ud158\u4492\u3dd3(\u59ec\u8413\u97e6\uc229\u3776.\uf9c5\u5140\ud158\u4492\u3dd3.class, invokeinterface:\uf9c5\u5140\ud158\u4492\u3dd3(Supplier<\uf9c5\u5140\ud158\u4492\u3dd3>::get, getfield:Supplier<\uf9c5\u5140\ud158\u4492\u3dd3>(\ud523\u92ff\ubb2b\u759a\ud36e::\uf995\u392e\u71ae\u718f\ud171\u71f1, this:\ud523\u92ff\ubb2b\u759a\ud36e)))
            }
            else {
                stack_8B_0 = getstatic:\uf9c5\u5140\ud158\u4492\u3dd3(\uf9c5\u5140\ud158\u4492\u3dd3::\u120d\u7330\u98a4\u7043\u8389\u446c)
            }
            
            return:\uf9c5\u5140\ud158\u4492\u3dd3(stack_8B_0:\uf9c5\u5140\ud158\u4492\u3dd3)
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u8d90\ubf56\u4179\ub83f\u527a(java.util.function.Supplier<\u59ec\u8413\u97e6\uc229\u3776.\uf9c5\u5140\ud158\u4492\u3dd3> p0) {
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
            putfield:Supplier<\uf9c5\u5140\ud158\u4492\u3dd3>(\ud523\u92ff\ubb2b\u759a\ud36e::\uf995\u392e\u71ae\u718f\ud171\u71f1, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:Supplier<\uf9c5\u5140\ud158\u4492\u3dd3>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub83f\u51fa\uc2bd\u88c5\ua6bd\uafe7() {
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
            return:boolean(getfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u494c\uf995\u4c04\u51b2\u600f\u6b0d, this:\ud523\u92ff\ubb2b\u759a\ud36e))
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u5fe1\uc229\u74b1\ufe34\u5bc4(boolean p0) {
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
            putfield:boolean(\ud523\u92ff\ubb2b\u759a\ud36e::\u494c\uf995\u4c04\u51b2\u600f\u6b0d, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:boolean)
            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, this:\ud523\u92ff\ubb2b\u759a\ud36e, and:int[expected:boolean](ldc:int(1027), ldc:int(20801)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f lambda$\u3e2a\u76bc\ubcb0\uf94d\u7bad\u4daf$10(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\ud523\u92ff\ubb2b\u759a\ud36e::\u9033\u3711\u494c\u88c5\u69d9\u97b7, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a lambda$\u9255\u59ec\u51fa\ufcaf\u6b0d\u6d69$9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.longs.LongSet lambda$\u120d\u3711\u8c8a\u385b\ua61f\u873d$8(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0) {
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
            return:LongSet(initobject:LongOpenHashSet[expected:LongSet](LongOpenHashSet::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.longs.LongSet lambda$\ub8be\u839e\u9937\u64ab\u3711\u64ab$7(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0) {
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
            return:LongSet(initobject:LongOpenHashSet[expected:LongSet](LongOpenHashSet::<init>))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u56bd\uc229\u3dd3\u983f\u5bc4\ud51e$6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1800869112), ldc:int(-1621131280))
            
            if (cmpeq:boolean(invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(63839487))
                stack_8E_0 = and:int(ldc:int(17174), ldc:int(-19223))
            }
            else {
                stack_8E_0 = and:int(ldc:int(16489), ldc:int(12289))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u71ae\u7006\ub171\u4ab3\uff55\u4daf$5(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_2_61 : int
        stack_9C_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1685517443), ldc:int(603497191))
            
            if (cmpeq:boolean(and:int(p0:int, shl:int(and:int(ldc:int(3681), ldc:int(271)), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(-6143), ldc:int(-6139))))), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1951836184))
                stack_9C_0 = and:int(ldc:int(29210), ldc:int(-29467))
            }
            else {
                stack_9C_0 = and:int(ldc:int(4281), ldc:int(257))
            }
            
            return:boolean(stack_9C_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6b0d\u983f\u98a4\u47c2\u6b5f\ub8be$4(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(1035), ldc:int(4353)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u0800\u527a\uc238\u12b2\u4d85\u4f52$3(int p0, int p1, int p2) {
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
            return:String(invokestatic:String(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, p0:int, p1:int, p2:int))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u71ae\u97b7\u72f1\u51fa\ud171\u6b0d$2(int p0, int p1, int p2) {
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
            return:String(invokestatic:String(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, p0:int, p1:int, p2:int))
        }
        
        goto(Label_0006)
    }
    
    private \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52 lambda$\ub102\u0a06\ub6ab\ub18d\u6ec6\u759a$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0) {
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
            return:\u8df4\u7ce1\ub6ab\u5245\u7d52(initobject:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u8df4\u7ce1\ub6ab\u5245\u7d52::<init>, this:\ud523\u92ff\ubb2b\u759a\ud36e[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52], p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9))
        }
        
        goto(Label_0006)
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f lambda$\u839e\u4c04\u385b\u0800\ubff1\u0b8e$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, this:\ud523\u92ff\ubb2b\u759a\ud36e, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:\u7d52\u718f\u3776\u6fb0\ub83f(p0:\u7d52\u718f\u3776\u6fb0\ub83f)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_356 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_A7_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_369_0 : byte[] [generated]
        stack_3B2_0 : byte[] [generated]
        stack_439_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_2F0 : byte[]
        var_4_2F1 : int
        expr_A9 : int [generated]
        var_5_341 : int
        var_3_346 : byte[]
        var_4_347 : int
        var_0_3CC : int
        expr_3B2 : byte [generated]
        stack_404_2 : byte [generated]
        stack_3D8_0 : byte [generated]
        expr_D0 : int [generated]
        expr_109 : int [generated]
        var_3_427 : byte[]
        var_4_428 : int
        expr_439 : byte [generated]
        var_3_14B : String
        stack_2DD_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
            var_0_356 = and:int(ldc:int(1269085632), ldc:int(-1379757095))
            expr_68 = var_2_6C = stack_A7_0 = stack_A9_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_369_0 = stack_3B2_0 = stack_439_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MPnhgev/+eHpiYuHgelbIJEaAaPfyekkZ3JZJC+JyVoZ4+fpqQop6+dyUclqEdnpDGH3yUHaARwviYmJqWIDt7EsJ3H8N+npScoh+aPHmbOncZtJAkGhUlDZQeppiYv/sfnhgevnSap5SnLQ2UHqaYmLn5GJYjmj50mqeUoa+OHR+WoR2ZJQmiHZo+86S6/58fmj99vgyQJBoRt/sfnhgeuXiZFqOWmcQMKncfx/+VmkH4mRChGj38npJH+x+eGB65eJkWo5aZx/sfnhgeuncfx3+SQv+eHR+WoR2ZJQmiHZo+86S6/58fmj99v/sfnhgeuXiZFqOWmcH4n5VH+x+eGB66dx/H/5WaQfuYH5idmj9/kkL/nh0flqEdnzp3GyuKpZiYuv+eHR+WoR2fvZgedx3GGncaQZ52oZkRoBo//5u4Hncdxhp3GkeeGncaI5mbHBuULJcYGx2eFJyZSA"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_2F0 = newarray:byte[](byte.class, expr_70:int)
                var_4_2F1 = expr_70:int
                
                loop {
                    var_0_356 = and:int(var_0_356:int, ldc:int(1777316860))
                    var_4_2F1 = add:int(var_4_2F1:int, ldc:int(-1))
                    storeelement:byte(var_3_2F0:byte[], var_4_2F1:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_2F1:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_2F1:int, xor:int(ldc:int(6416), ldc:int(6417)))), ldc:int(7)), xor:int(ldc:int(11272), ldc:int(11273)))))
                    
                    if (cmpne:boolean(var_4_2F1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_369_0 = stack_3B2_0 = stack_439_0 = var_3_2F0:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0270)
                }
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(-970502822))
                    goto(Label_0213)
                }
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(882150309))
                    goto(Label_0174)
                }
                
                var_0_356 = and:int(var_0_356:int, ldc:int(1267071985))
                expr_A9 = arraylength:int(stack_A9_0:byte[])
                
                if (cmpeq:boolean(expr_A9:int, ldc:int(0))) {
                    goto(Label_0174)
                }
                
                var_5_341 = expr_A9:int
                var_3_346 = newarray:byte[](byte.class, expr_A9:int)
                var_4_347 = expr_A9:int
                Label_0841:
                
                while (cmpeq:boolean(and:int(var_0_356:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(1808260044))
                    var_4_347 = add:int(var_4_347:int, ldc:int(-1))
                    storeelement:byte(var_3_346:byte[], var_4_347:int, add:byte(xor:byte(loadelement:byte(stack_369_0:byte[], var_4_347:int), ldc:byte(80)), ldc:byte(45)))
                    
                    if (cmpne:boolean(var_4_347:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_369_0 = stack_3B2_0 = stack_439_0 = var_3_346:byte[]
                    goto(Label_0174)
                }
                
                var_0_356 = and:int(var_0_356:int, ldc:int(1174176157))
                Label_0923:
                
                while (cmpeq:boolean(and:int(var_0_356:int, ldc:int(1)), ldc:int(0))) {
                    var_0_3CC = and:int(var_0_356:int, ldc:int(2111747556))
                    var_4_347 = add:int(var_4_347:int, ldc:int(-1))
                    expr_3B2 = stack_404_2 = loadelement(stack_3B2_0, var_4_347)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_347:int, ldc:int(1)), neg:int(var_5_341:int)), ldc:int(0))) {
                        stack_404_2 = stack_3D8_0 = add:byte(expr_3B2:byte, loadelement:byte(var_3_346:byte[], add:int(var_4_347:int, ldc:int(1))))
                        goto(Label_1000)
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_0_3CC:int, ldc:int(16384)), ldc:int(0))) {
                        var_0_3CC = and:int(var_0_3CC:int, ldc:int(913240298))
                    }
                    else {
                        var_0_3CC = and:int(var_0_3CC:int, ldc:int(-269886495))
                        stack_404_2 = stack_3D8_0 = add:byte(expr_3B2:byte, ldc:byte(1))
                    }
                    
                    Label_1000:
                    
                    if (cmpne:boolean(and:int(var_0_3CC:int, ldc:int(16)), ldc:int(0))) {
                        var_0_3CC = and:int(var_0_3CC:int, ldc:int(919367875))
                        goto(Label_0959)
                    }
                    
                    var_0_356 = and:int(var_0_3CC:int, ldc:int(-1947993146))
                    storeelement:byte(var_3_346:byte[], var_4_347:int, stack_404_2:byte)
                    
                    if (cmpne:boolean(var_4_347:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_369_0 = stack_3B2_0 = stack_439_0 = var_3_346:byte[]
                    goto(Label_0213)
                }
                
                goto(Label_0841)
                Label_0174:
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0270)
                }
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_356:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_356 = and:int(var_0_356:int, ldc:int(-1110862879))
                    expr_D0 = arraylength:int(stack_D0_0:byte[])
                    
                    if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                        var_5_341 = expr_D0:int
                        var_3_346 = newarray:byte[](byte.class, expr_D0:int)
                        var_4_347 = expr_D0:int
                        goto(Label_0923)
                    }
                }
                
                Label_0213:
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(-10380292))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_356:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0174)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_356:int, ldc:int(16384)), ldc:int(0))) {
                        var_0_356 = and:int(var_0_356:int, ldc:int(-277843355))
                        loopcontinue()
                    }
                    
                    var_0_356 = and:int(var_0_356:int, ldc:int(-542402589))
                    expr_109 = arraylength:int(stack_109_0:byte[])
                    
                    if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                        var_3_427 = newarray:byte[](byte.class, expr_109:int)
                        var_4_428 = expr_109:int
                        
                        loop {
                            var_0_356 = and:int(var_0_356:int, ldc:int(-1685063184))
                            var_4_428 = add:int(var_4_428:int, ldc:int(-1))
                            expr_439 = loadelement:byte(stack_439_0:byte[], var_4_428:int)
                            storeelement:byte(var_3_427:byte[], var_4_428:int, or:int(and:int(shl:int(expr_439:byte, and:int(ldc:int(3332), ldc:int(8333))), ldc:int(-16)), and:int(shr:int(expr_439:byte[expected:int], and:int(ldc:int(23301), ldc:int(9284))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_428:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_369_0 = stack_3B2_0 = stack_439_0 = var_3_427:byte[]
                    }
                }
                
                Label_0270:
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(256)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(3759129))
                    goto(Label_0213)
                }
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(16)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(941887191))
                    goto(Label_0174)
                }
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2DD_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32760), ldc:int(-32762)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(14), ldc:int(2255)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(20134), ldc:int(4354)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-20530), ldc:int(20529)), xor:int(ldc:int(16401), ldc:int(16414))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(8850), ldc:int(-8851)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(16715), ldc:int(16708)), and:int(ldc:int(9299), ldc:int(16595))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(163), ldc:int(169)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4307), ldc:int(1651)), and:int(ldc:int(14424), ldc:int(376))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(1028), ldc:int(1029)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(103), ldc:int(63)), and:int(ldc:int(123), ldc:int(18539))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(2177), ldc:int(2181)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(4190), ldc:int(4149)), and:int(ldc:int(17918), ldc:int(8318))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(10191), ldc:int(2099)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16894), ldc:int(8831)), and:int(ldc:int(29062), ldc:int(742))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(1100), ldc:int(8204)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(135), ldc:int(1190)), xor:int(ldc:int(3350), ldc:int(3531))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-32763), ldc:int(-32760)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16605), ldc:int(4317)), xor:int(ldc:int(16736), ldc:int(16448))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(16967), ldc:int(4117)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(495), ldc:int(207)), and:int(ldc:int(1359), ldc:int(4559))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-30396), ldc:int(-30385)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(6495), ldc:int(10063)), and:int(ldc:int(18771), ldc:int(12665))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(8473), ldc:int(1673)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(535), ldc:int(838)), and:int(ldc:int(21499), ldc:int(351))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(6), ldc:int(1478)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-27859), ldc:int(-28042)), and:int(ldc:int(350), ldc:int(14173))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-30699), ldc:int(-30702)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(8540), ldc:int(1372)), xor:int(ldc:int(171), ldc:int(502))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(17154), ldc:int(17162)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(153), ldc:int(452)), xor:int(ldc:int(13015), ldc:int(13193))))
            putstatic:String[](\ud523\u92ff\ubb2b\u759a\ud36e::\u7bad\u7bad\u6c52\u6d69\u3dd3\u946b, expr_15D:String[])
            putstatic:Logger(\ud523\u92ff\ubb2b\u759a\ud36e::\u4492\uc84e\ubf56\u9033\u9033\u9af2, invokestatic:Logger(LogManager::getLogger))
            putstatic:\uc29a\u6198\u6bb9\u4492\u965f(\ud523\u92ff\ubb2b\u759a\ud36e::\ua6bd\u8d90\ub8be\u71ae\u8413\ub8be, aconstnull:\uc29a\u6198\u6bb9\u4492\u965f())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc229\u4975\ud158\u446c\u6c52\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-1615433394), ldc:int(-1128333458))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud523\u92ff\ubb2b\u759a\ud36e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1088948906))
            var_5_81 = and:int(ldc:int(-5480), ldc:int(1351))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26340), ldc:int(25795)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67B:int, ldc:int(-145434186))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(16577), ldc:int(16576)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1665), ldc:int(2097)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_DA:int, ldc:int(272423175))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(6403), ldc:int(16465)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1305474096))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(463106519))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1969431721))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-18031183))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1725862839))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1889742160))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(852399739))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(56025725))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1773193761))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1127617679))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2040589545))
                        var_11_EB = and:int(ldc:int(17859), ldc:int(-24008))
                        goto(Label_1562)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(802919867))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1656672535))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1152754087))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-401262802))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(747700923))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-789484431))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(599046575))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2096341084))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1895208214))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(254060613))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-581461752))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1899472305))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-384378618))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-962005374))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-626206252))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1805805689))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2071235593))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-29971538))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1789610633))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(3597), ldc:int(29025))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(616078276))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1331749996))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-289067236))
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1412948122))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1050109807))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1264907013))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-834498164))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-31600353))
                        var_11_EB = and:int(ldc:int(11341), ldc:int(-27774))
                    }
                    
                    Label_1191:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1863743200))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1030187755))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-279972431))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1068050530))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-850649905))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1298529902))
                            goto(Label_1191)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(522559560))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-37891754))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(626568326))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1209137652))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1748297319))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-719897658))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1496706167))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-962610890))
                        var_17_686 = add:int(var_16_119:int, and:int(ldc:int(8455), ldc:int(4721)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(1432346559))
                
                if (cmple:boolean(var_5_81 = var_17_686:int, sub:int(var_6_88:int, xor:int(ldc:int(-32764), ldc:int(-32763))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1421503388))
            goto(Label_0108)
        }
    }
}
