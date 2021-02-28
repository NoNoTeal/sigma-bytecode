public class \u516c\u3d64\u718f\ub171\u6b5f.\u8709\u7ce1\ub6ab\ubcb0\u8cae {
    public void \u8709\u7ce1\ub6ab\ubcb0\u8cae() {
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
            invokespecial:Object(Object::<init>, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8709\u7ce1\ub6ab\ubcb0\u8cae(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0, it.unimi.dsi.fastutil.shorts.ShortSet p1, \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f p2, boolean p3) {
        var_7_80 : int
        var_8_88 : ShortIterator
        var_9_AE : short
        
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
            invokespecial:Object(Object::<init>, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)
            putfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, p0:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2)
            putfield:boolean(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\ube23\u3711\u8d98\u3776\u156b\u61a4, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, p3:boolean)
            invokespecial:void(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\uc84e\u839e\u71f1\u5d20\uc87f\u5245, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, invokeinterface:int(ShortSet::size, p1:ShortSet))
            var_7_80 = and:int(ldc:int(-30146), ldc:int(21953))
            var_8_88 = invokeinterface:ShortIterator(ShortSet::iterator, p1:ShortSet)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_8_88:Iterator)) {
                var_9_AE = invokevirtual:short(Short::shortValue, checkcast:Short(java.lang.Short.class, invokeinterface:Short(Iterator<Short>::next, var_8_88:Iterator<Short>)))
                storeelement:short(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_7_80:int, var_9_AE:short)
                storeelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u6198\u4f4a\u5db4\u61a4\u61a4\u385b, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_7_80:int, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc29a\u6198\u6bb9\u4492\u965f::\ud158\u4179\u8df4\u59ec\u64ab\u67d0, p2:\uc29a\u6198\u6bb9\u4492\u965f, invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u8389\u1187\u8d90\u8df4\u5140\u4f52, var_9_AE:short), invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\ud523\uc9f6\u56bd\ub83f\ud7e8\u8640, var_9_AE:short), invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u6fb0\uc229\u960f\u647c\u5d20\u7ce1, var_9_AE:short)))
                inc:int(var_7_80, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc84e\u839e\u71f1\u5d20\uc87f\u5245(int p0) {
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
            putfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, newarray:short[](short.class, p0:int))
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u6198\u4f4a\u5db4\u61a4\u61a4\u385b, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, newarray:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, p0:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\ub19c\ubff1\u8aa5\ubb2b\ud7e8(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_5_86 : int
        var_6_A5 : long
        
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
            var_2_5F = and:int(ldc:int(-1814716437), ldc:int(838663123))
            putfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, invokevirtual:long(\u98a4\uafe7\uc3e3\ua6bd\u8640::readLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)))
            putfield:boolean(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\ube23\u3711\u8d98\u3776\u156b\u61a4, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::readBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            invokespecial:void(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\uc84e\u839e\u71f1\u5d20\uc87f\u5245, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6bb9\ub19c\u760c\ucef1\u3776\uf9c5, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            var_5_86 = and:int(ldc:int(30737), ldc:int(-30802))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(133545946))
                
                if (cmpge:boolean(var_5_86:int, arraylength:int(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)))) {
                    looporswitchbreak()
                }
                
                var_6_A5 = invokevirtual:long(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u93a2\u8bb0\u7c6b\u40a9\u8350\u3bd6, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                storeelement:short(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_5_86:int, i2s:short(l2i:int(and:long(var_6_A5:long, ldc:long(4095L)))))
                storeelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u6198\u4f4a\u5db4\u61a4\u61a4\u385b, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_5_86:int, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\ufe34\u6ec6\uceb8\uff55\u9033\ube23, getstatic:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u7330\u7043\u3776\uc9f6\u74b1\u8df4), l2i:int(ushr:long(var_6_A5:long, ldc:int(12))))))
                inc:int(var_5_86, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u3bd6\u8389\u7bad\u62da\u873d(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_2_5F : int
        var_4_86 : int
        
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
            var_2_5F = and:int(ldc:int(541780642), ldc:int(-726106121))
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:long(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\ub102\u40a9\u3bc9\u7bad\u516c\u960f, getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)))
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeBoolean, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:boolean(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\ube23\u3711\u8d98\u3776\u156b\u61a4, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae))
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, arraylength:int(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)))
            var_4_86 = and:int(ldc:int(28360), ldc:int(-28633))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(613220195))
                
                if (cmpge:boolean(var_4_86:int, arraylength:int(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\uf9c5\ube23\u8d98\u760c\uf9c5\u759a, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, i2l:long(or:int(shl:int(invokestatic:int(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u3bc9\u183a\ucb79\ubded\u3504\u839e, loadelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u6198\u4f4a\u5db4\u61a4\u61a4\u385b, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_4_86:int)), ldc:int(12)), loadelement:short(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_4_86:int))))
                inc:int(var_4_86, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u759a\u8cae\u59ec\u446c\u71f1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5d20\u4f52\ud523\uc84e\u0800\u6ec6 p0) {
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
            invokeinterface:void(\u5d20\u4f52\ud523\uc84e\u0800\u6ec6::\u8d90\u071d\ua3b4\u183a\uc238\u36d3, p0:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufe34\u873d\ud12e\uceb8\u4e72\u120d(java.util.function.BiConsumer<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
        var_2_5F : int
        var_4_67 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_5_70 : int
        var_6_92 : short
        
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
            var_2_5F = and:int(ldc:int(-142004436), ldc:int(-961222809))
            var_4_67 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            var_5_70 = and:int(ldc:int(-4059), ldc:int(3928))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1310613523))
                
                if (cmpge:boolean(var_5_70:int, arraylength:int(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae)))) {
                    looporswitchbreak()
                }
                
                var_6_92 = loadelement:short(getfield:short[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u7d52\u5bc4\u983f\uc84e\u8cae\u8413, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_5_70:int)
                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_4_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, invokevirtual:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u72f1\u7049\u4c2b\ucb79\uafe7\u5bc4, getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_6_92:short), invokevirtual:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\ub113\u183a\u8258\u5245\u59ec\u71ae, getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_6_92:short), invokevirtual:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u6d69\u62da\u9033\ua61f\ua3b4\u6d69, getfield:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u9255\u61a4\ufe34\u385b\u12cb\u93a2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_6_92:short))
                invokeinterface:void(BiConsumer<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::accept, p0:BiConsumer<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, var_4_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, loadelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u6198\u4f4a\u5db4\u61a4\u61a4\u385b, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae), var_5_70:int))
                inc:int(var_5_70, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4d85\ud4fe\u385b\u4c2b\u7ce1\u624e() {
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
            return:boolean(getfield:boolean(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\ube23\u3711\u8d98\u3776\u156b\u61a4, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae))
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u759a\u8cae\u59ec\u446c\u71f1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u446c\u7c6b\u8bb0\u4975\u76bc p0) {
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
            invokevirtual:void(\u8709\u7ce1\ub6ab\ubcb0\u8cae::\u3dd3\u759a\u8cae\u59ec\u446c\u71f1, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae, checkcast:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5d20\u4f52\ud523\uc84e\u0800\u6ec6.class, p0:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6]))
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
    
    public void \u7873\u4bc8\uc229\ucb79\u120d\u9a18(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_646 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_651 : int
        
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
        var_3_646 = and:int(ldc:int(-1490567192), ldc:int(27703275))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\u7ce1\ub6ab\ubcb0\u8cae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(79149030))
            var_5_7D = and:int(ldc:int(-14225), ldc:int(10128))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2319), ldc:int(2318)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_646:int, ldc:int(664729584))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, and:int(ldc:int(2241), ldc:int(16417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, xor:int(ldc:int(1152), ldc:int(1153)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_646 = and:int(var_3_CD:int, ldc:int(108967866))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(9474), ldc:int(9475)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1990985194))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1917953574))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1214830542))
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1427219424))
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0680)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-657427484))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(497535890))
                    }
                    else {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1024983120))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(540028912))
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0680)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1040756875))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(381138854))
                            var_11_DE = and:int(ldc:int(-23277), ldc:int(21216))
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(937668764))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(317663857))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-803236647))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(857145264))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0680:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1405947194))
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1636886573))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(390894975))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1592205297))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1880623133))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0811:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1734816772))
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1945870873))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1653934528))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(343656031))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(655695164))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-189267976))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(-28408), ldc:int(-28407))
                                goto(Label_1076)
                            }
                        }
                    }
                    
                    Label_0944:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1150658178))
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-822624325))
                        var_11_DE = and:int(ldc:int(-12691), ldc:int(12690))
                    }
                    
                    Label_1076:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1056058119))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-245987540))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1282936575))
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1669606485))
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1473067823))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1669941329))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1336)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1474795256))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-450533531))
                            goto(Label_1076)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1987004530))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1351008255))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1336:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1794002931))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-488450056))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(59607488))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(333043793))
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0680)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2138906247))
                        loopcontinue()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(-1229998155))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1482:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_651 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1493:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(908238068))
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1968744130))
                        goto(Label_1076)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1108184960))
                        goto(Label_0680)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-253297444))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(739768307))
                        var_17_651 = add:int(var_16_10C:int, and:int(ldc:int(2145), ldc:int(8723)))
                        looporswitchbreak()
                    }
                }
                
                var_3_646 = and:int(var_3_646:int, ldc:int(-466108448))
                
                if (cmple:boolean(var_5_7D = var_17_651:int, sub:int(var_6_84:int, xor:int(ldc:int(650), ldc:int(651))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
